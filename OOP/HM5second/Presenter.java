package OOP.HM5second;

public class Presenter {
    View view;
    ComplexNumbersCalculation cnc = new ComplexNumbersCalculation();
    RationalNumbersCalculation rnc = new RationalNumbersCalculation();
    Menu menu;

    public Presenter (View v, Menu menu ){
        this.menu = menu;
        view = v;
        
    }

    public void start(){
        while (true){
            switch (menu.selectCalc()){
                case "1":
                    while(true){
                        switch(menu.selectOperation()){
                            case "1":

                            Double x = view.getNumber("Введите действительную часть первого числа: ");
                            Double y = view.getNumber("Введите мнимую часть первого числа: ");
                            cnc.setX(x);
                            cnc.setY(y);
                            Double a = view.getNumber("Введите действительную часть второго числа: ");
                            Double b = view.getNumber("Введите мнимую часть второго числа: ");
                            cnc.setA(a);
                            cnc.setB(b);
                            view.print(cnc.sum(), "Cумма комплексных чисел");
                            case "2":
                            x = view.getNumber("Введите действительную часть первого числа: ");
                            y = view.getNumber("Введите мнимую часть первого числа: ");
                            cnc.setX(x);
                            cnc.setY(y);
                            a = view.getNumber("Введите действительную часть второго числа: ");
                            b = view.getNumber("Введите мнимую часть второго числа: ");
                            cnc.setA(a);
                            cnc.setB(b);
                            view.print(cnc.diff(), "Разность комплексных чисел");
                            case "3":
                            x = view.getNumber("Введите действительную часть первого числа: ");
                            y = view.getNumber("Введите мнимую часть первого числа: ");
                            cnc.setX(x);
                            cnc.setY(y);
                            a = view.getNumber("Введите действительную часть второго числа: ");
                            b = view.getNumber("Введите мнимую часть второго числа: ");
                            cnc.setA(a);
                            cnc.setB(b);
                            view.print(cnc.multiply(), "Произведение комплексных чисел");
                            case "4":
                            x = view.getNumber("Введите действительную часть первого числа: ");
                            y = view.getNumber("Введите мнимую часть первого числа: ");
                            cnc.setX(x);
                            cnc.setY(y);
                            a = view.getNumber("Введите действительную часть второго числа: ");
                            b = view.getNumber("Введите мнимую часть второго числа: ");
                            cnc.setA(a);
                            cnc.setB(b);
                            view.print(cnc.div(), "Частное от деления комплексных чисел");

                            case "0":
                            System.exit(0);
                            
                        }
                    }
               



                case "2":
                    while(true){
                        switch(menu.selectOperation()){
                            case"1":
                           Double x = view.getNumber("Введите первое число: ");
                           Double y = view.getNumber("Введите второе число: ");
                            rnc.setX(x);
                            rnc.setY(y);
                            view.print(rnc.sum(), "Сумма чисел");
                            case"2":
                            x = view.getNumber("Введите первое число: ");
                            y = view.getNumber("Введите второе число: ");
                            rnc.setX(x);
                            rnc.setY(y);
                            view.print(rnc.diff(), "Разность чисел");
                            case"3":
                            x = view.getNumber("Введите первое число: ");
                            y = view.getNumber("Введите второе число: ");
                            rnc.setX(x);
                            rnc.setY(y);
                            view.print(rnc.multiply(), "Произведение чисел");
                            case"4":
                            x = view.getNumber("Введите первое число: ");
                            y = view.getNumber("Введите второе число: ");
                            rnc.setX(x);
                            rnc.setY(y);
                            view.print(rnc.div(), "Частное от деления чисел");
                            case "0":
                            System.exit(0);

                        }
                        
                    }

              
                case "0":
                System.exit(0);

            }
        }
    }

}
   
   
    


