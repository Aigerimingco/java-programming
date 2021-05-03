package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection=3;
        if(selection==1) {
            System.out.println("Hello, thank you for your call");
        }
        if(selection==2){
            System.out.println("hola, gracias para llamar");
        }else if(selection==3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else if(selection==3){
            System.out.println("privet, spasibo za vash zvonok");
        }else if(selection==4){
            System.out.println("merci,pour votre appel");
        }
    }
}

