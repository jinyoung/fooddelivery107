<template>

    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title>
            
        </v-card-title>

        <v-card-text>
        </v-card-text>

        <v-card-actions v-if="inList">
            <slot name="actions"></slot>
        </v-card-actions>
    </div>
</template>

<script>
    


    export default {
        name: 'Item',
        components:{
        },
        props: {
            value: [Object, String, Number, Boolean, Array],
            editMode: Boolean,
            isNew: Boolean,
            offline: Boolean,
            inList: Boolean,
            label: String,
        },
        data: () => ({
        
        }),
        async created() {
            if(!('foodId' in this.value)) {
                this.value.foodId = '';
            }
            if(!('qty' in this.value)) {
                this.value.qty = 0;
            }
            if(!('option' in this.value)) {
                this.value.option = '';
            }
        },
        watch: {
                        value(val) {
                this.$emit('input', val);
            },
            newValue(val) {
                this.$emit('input', val);
            },
            
        },

        methods: {
            edit() {
                this.editMode = true;
            },
                        async add() {
                this.editMode = false;
                this.$emit('input', this.value);

                if(this.isNew){
                    this.$emit('add', this.value);
                } else {
                    this.$emit('edit', this.value);
                }
            },
            async remove(){
                this.editMode = false;
                this.isDeleted = true;

                this.$emit('input', this.value);
                this.$emit('delete', this.value);
            },
            change(){
                this.$emit('change', this.value);
            },
            
        }
    }
</script>

