package com.corejava;

class HumanSuper {
    void human() {
        System.out.println("parent");
    }
}

class son extends HumanSuper {
    void human() {
        super.human(); // Calls parent class method
        System.out.println("boy");
    }
}

class daughter extends HumanSuper {
    void human() {
        System.out.println("girl");
    }
}