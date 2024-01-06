import Auth.Auth;
import Cars.Car;
import Cars.Suv;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isSuccess = false;

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> authList = new HashMap<>();
        authList.put("Yunus", "12345");
        authList.put("Emre", "23456");



        System.out.println("Kullanıcı Adını Giriniz");
        String userName = sc.nextLine();


        for (String userNameControl : authList.keySet()) {

            if (userNameControl.equals(userName)) {
                userName = userNameControl;
                System.out.println("Sifrenizi Giriniz");
                String password = sc.nextLine();
                if (authList.get(userName).equals(password)) {
                    System.out.println("Giriş Başarılı");
                    //isSuccess=true;
                }
                System.out.println("Şifre Yanlıs");
                isSuccess=false;
                break;
            }
            System.out.println("Kullanıcı Adı Yanlıs");
            //isSuccess=false;
            break;

        }

        if(isSuccess){
            System.out.println("Kiralamak İstediğiniz Araç Çeşidi : \n" +
                                "1. Suv \n"+
                                "2. Sedan \n"+
                                "3.Hatchback\n");
            int control = sc.nextInt();
            if(control==1){

            }
        }


    }


}