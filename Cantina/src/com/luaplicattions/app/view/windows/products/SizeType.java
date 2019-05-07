package com.luaplicattions.app.view.windows.products;

public enum SizeType {
    KG{
        @Override
        public String toString(){
            return "Quilo";
        }
    },
    LT{
        @Override
        public String toString(){
            return "Litro";
        }
    }, 
    UND{
        @Override
        public String toString(){
            return "Unidade";
        }
    }
}
