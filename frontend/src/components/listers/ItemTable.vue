<template>

    <v-data-table
            :headers="headers"
            :items="item"
            :items-per-page="5"
            class="elevation-1"
    ></v-data-table>

</template>

<script>

    export default {
        name: 'ItemList',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { 
                    text: "id", 
                    value: "id" 
                },
                { 
                    text: "foodId", 
                    value: "foodId" 
                },
                { 
                    text: "qty", 
                    value: "qty" 
                },
                { 
                    text: "option", 
                    value: "option" 
                },
            ],
            item : [],
        }),
        async created() {
            if(!this.value) this.value = [];
        },
        methods: {
        }
    }
</script>

