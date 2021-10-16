package models;

import service.CustomerService;

public class Main {

    public static void main(String[] args) {
        CustomerService customerService=new CustomerService();
        System.out.println("***WELCOME TO MOHI ONLINE SHOP***");
        customerService.register();
        showMenu();




    }
    public static void showMenu(){
        System.out.println(" .افزودن محصول به سبد خرید\n" +
                "2 .حذف محصول از سبد خرید\n" +
                "3 .چاپ لیست کلیه محصوالت اضافه شده به سبد خرید به همراه تعداد آ نها\n" +
                "4 .چاپ مجموعه قیمت های آیتم های سبد خرید\n" +
                "5 .تایید نهایی خرید با تایید کاربر\n" +
                "6 .همچنین موجودی فروشگاه متناسب با تعداد موارد خریداری شده بروزرسانی شود.");
    }

}
