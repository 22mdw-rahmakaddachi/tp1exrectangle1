//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class rectangle {
    float longueur;
    float largeur;

    public rectangle(float lo, float la) {
        this.longueur = lo;
        this.largeur = la;
    }

    public float perimetre() {
        return 2.0F * (this.longueur + this.largeur);
    }

    public double diagonal() {
        return (double)(this.longueur + this.largeur);
    }

    public float doubler() {
        return this.longueur * 2.0F;
    }

    public float doublerlar() {
        return this.largeur * 2.0F;
    }

    public static void main(String[] args) {
        rectangle r1 = new rectangle(100.0F, 200.0F);
        System.out.println("le perimetre est" + r1.perimetre());
        System.out.println("le diagonal est" + r1.diagonal());
        System.out.println("longueur double est " + r1.doubler());
        System.out.println("largueur double est " + r1.doublerlar());
    }
}
