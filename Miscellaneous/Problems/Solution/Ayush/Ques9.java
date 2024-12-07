import java.util.Scanner;
public class Ques9 {
    public static void main(String[] args) {
        System.out.println("Menu\n"+
                "Press 1 for Garlic Naan - 30 per piece\n"+
                "Press 2 for Butter Chicken - 250 \n"+
                "Press 3 for Mushroom Stew - 225\n"+
                "Press 4 for Rice - 100\n");
        System.out.println("How many items you wanna order (ranging from 1 to 4 item at once)");
        Scanner input = new Scanner(System.in);
        int item = input.nextInt();
        int fooditem1,fooditem2,fooditem3,fooditem4,split, tip;
        float bill=1,bill2=1,bill3=1,bill4=1,tax=0.18F, finalbill=1,finalfinalbill=1;
        switch (item) {
            case 1:
                System.out.println("What you would like to order?");
                fooditem1 = input.nextInt();
                if(fooditem1==1){
                    bill=30;
                }if(fooditem1==2){
                bill=250;
            }if(fooditem1==3){
                bill=225;
            }if(fooditem1==4){
                bill=100;
            }
                System.out.println("How much tip you would like to give?\n"+
                        "1 for 10%\n"+
                        "2 for 15%\n"+
                        "3 for 20%\n");
                tip=input.nextInt();

                switch (tip) {
                    case 1:
                        finalbill = (float) ((float) (bill + (bill*0.1)) + (((bill + (bill *0.1))*0.18)));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                    case 2:
                        finalbill = (float) (bill + (bill*0.15) + ((bill + (bill*0.15))*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                    case 3:
                        finalbill = (float) (bill + (bill*0.2) + ((bill + (bill*0.2))*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("What you would like to order?");
                fooditem1 = input.nextInt();
                fooditem2 = input.nextInt();
                if(fooditem1==1){
                    bill=30;
                }if(fooditem1==2){
                bill=250;
            }if(fooditem1==3){
                bill=225;
            }if(fooditem1==4){
                bill=100;
            }
                if(fooditem2==1){
                    bill2=30;
                }if(fooditem2==2){
                bill2=250;
            }if(fooditem2==3){
                bill2=225;
            }if(fooditem2==4){
                bill2=100;
            }
                System.out.println("How much tip you would like to give?\n"+
                        "1 for 10%\n"+
                        "2 for 15%\n"+
                        "3 for 20%\n");
                tip=input.nextInt();

                switch (tip) {
                    case 1:
                        finalbill = (float) ((bill + bill2+((bill+bill2)*0.1)) + (((bill+bill2)* 0.1)*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                    case 2:
                        finalbill = (float) ((bill +bill2 + ((bill +bill2) *0.15)) + (((bill +bill2)*0.15)*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                    case 3:
                        finalbill = (float) ((bill +bill2+((bill+bill2)*0.2)) +(((bill +bill2)*0.2)*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                }
                break;

            case 3:
                System.out.println("What you would like to order? (Enter 3 item choices)");
                fooditem1 = input.nextInt();
                fooditem2 = input.nextInt();
                fooditem3 = input.nextInt();


                if(fooditem1==1){
                    bill=30;
                }if(fooditem1==2){
                bill=250;
            }if(fooditem1==3){
                bill=225;
            }if(fooditem1==4){
                bill=100;
            }
                if(fooditem2==1){
                    bill2=30;
                }if(fooditem2==2){
                bill2=250;
            }if(fooditem2==3){
                bill2=225;
            }if(fooditem2==4){
                bill2=100;
            }

                if(fooditem3==1){
                    bill3=30;
                }if(fooditem3==2){
                bill3=250;
            }if(fooditem3==3){
                bill3=225;
            }if(fooditem3==4){
                bill3=100;
            }

                System.out.println("How much tip you would like to give?\n" +
                        "1 for 10%\n" +
                        "2 for 15%\n" +
                        "3 for 20%");
                tip = input.nextInt();

                switch (tip) {
                    case 1:
                        finalbill = (float) ((bill + bill2+bill3+((bill+bill2+bill3)*0.1)) + (((bill+bill2+bill3)* 0.1)*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                    case 2:
                        finalbill = (float) ((bill + bill2+bill3+((bill+bill2+bill3)*0.15)) + (((bill+bill2+bill3)* 0.15)*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                    case 3:
                        finalbill = (float) ((bill + bill2+bill3+((bill+bill2+bill3)*0.2)) + (((bill+bill2+bill3)* 0.2)*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                }
                break;
            case 4:
                System.out.println("What you would like to order? (Enter 4 item choices)");
                fooditem1 = input.nextInt();
                fooditem2 = input.nextInt();
                fooditem3 = input.nextInt();
                fooditem4 = input.nextInt();


                if(fooditem1==1){
                    bill=30;
                }if(fooditem1==2){
                bill=250;
            }if(fooditem1==3){
                bill=225;
            }if(fooditem1==4){
                bill=100;
            }
                if(fooditem2==1){
                    bill2=30;
                }if(fooditem2==2){
                bill2=250;
            }if(fooditem2==3){
                bill2=225;
            }if(fooditem2==4){
                bill2=100;
            }

                if(fooditem3==1){
                    bill3=30;
                }if(fooditem3==2){
                bill3=250;
            }if(fooditem3==3){
                bill3=225;
            }if(fooditem3==4){
                bill3=100;
            }

                if(fooditem4==1){
                    bill4=30;
                }if(fooditem4==2){
                bill4=250;
            }if(fooditem4==3){
                bill4=225;
            }if(fooditem4==4){
                bill4=100;
            }

                System.out.println("How much tip you would like to give?\n" +
                        "1 for 10%\n" +
                        "2 for 15%\n" +
                        "3 for 20%");
                tip = input.nextInt();


                switch (tip) {
                    case 1:
                        finalbill = (float) ((bill +bill4+ bill2+bill3+((bill+bill2+bill3+bill4)*0.1)) + (((bill+bill2+bill3+bill4)* 0.1)*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                    case 2:
                        finalbill = (float) ((bill +bill4+ bill2+bill3+((bill+bill2+bill3+bill4)*0.15)) + (((bill+bill2+bill3+bill4)* 0.15)*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                    case 3:
                        finalbill = (float) ((bill +bill4+ bill2+bill3+((bill+bill2+bill3+bill4)*0.2)) + (((bill+bill2+bill3+bill4)* 0.2)*0.18));
                        System.out.println("Want to split bill?");
                        split=input.nextInt();
                        if(split == 1){
                            finalfinalbill=finalbill;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 2){
                            finalfinalbill = finalbill/2;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 3){
                            finalfinalbill = finalbill/3;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        } else if(split == 4){
                            finalfinalbill = finalbill/4;
                            System.out.println("Per person needs to pay " + finalfinalbill);
                        }
                        break;
                }
                break;

        }

    }
}
