<template>
    <v-card outlined>
        <v-card-title>
            Accept
        </v-card-title>

        <v-card-text>
            <Boolean label="AcceptYn" v-model="value.acceptYn" :editMode="editMode"/>
            <String label="Reason" v-model="value.reason" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="accept"
            >
                Accept
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'AcceptCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.acceptYn = false;
            this.value.reason = '';
        },
        watch: {
        },
        methods: {
            accept() {
                this.$emit('accept', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

