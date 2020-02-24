package calculator;

import java.util.Scanner;


public class Calculator {
    private String second;
    private int arg2;
    private String first;
    private int arg1;

    /* Основной CalculatorFabrika (запускаемый) класс программы должен создать экземпляр класса
     MyOpFactory, создать экземпляр класса Calculator, передав ему в качестве 
     параметра объект MyOpFactory и выполнить метод exec созданного объекта
     Calculator.
     */
    public class CalculatorFabrika {

        public static void main(String[] args) {
            //  Создаем экземпляр класса MyOpFactory
            MyOpFactory myOpFactory = new MyOpFactory();
            //  Создаем экземпляр класса Calculator 
            //  с агрументом в виде объекта MyOpFactory
            //  СОЗДАЕТ КАЛЬКУЛЯТОР
            Calculator calc = new Calculator(myOpFactory);
            //  Выполняем метод exec для объекта Calculator
            //  ЗАПУСКАЕМ КАЛЬКУЛЯТОР
            calc.exec();
        }
    }
    /*
     Интерфейс Operation олицетворяет классы, выполняющие некую операцию над
     двумя аргументами.
     */

    interface Operation {

        int exec(int valueOne, int valueTwo);
    }
    /*
     Создайте реализации интерфейса Operation для операций сложения, вычитания,
     умножения, деления (OpPlus, OpMinus, OpMul, OpDiv соответственно). 
     */
//  Операция СУММA

    class OpPlus implements Operation {

        @Override
        public int exec(int valueOne, int valueTwo) {
            return (valueOne + valueTwo);
        }
    }
//  Операция РАЗНОСТЬ

    class OpMinus implements Operation {

        @Override
        public int exec(int valueOne, int valueTwo) {
            return (valueOne - valueTwo);
        }
    }
//  Операция ПРОИЗВЕДЕНИЕ

    class OpMultiply implements Operation {

        @Override
        public int exec(int valueOne, int valueTwo) {
            return (valueOne * valueTwo);
        }
    }
//  Операция ДЕЛЕНИЯ

    class OpDivision implements Operation {

        @Override
        public int exec(int valueOne, int valueTwo) {
            return (valueOne / valueTwo);
        }
    }
    /*
     Если передан некорректный код операции, метод getOpInstance возвращает null.
   
     Создайте реализацию интерфейса OperationFactory, создающую перечисленные выше
     объекты (MyOpFactory). 
     */

    interface OperationFactory {

        Operation getOpInstance(int op);
    }
// Фабрика операций

    class MyOpFactory implements OperationFactory {

        int operationCode;
        private Operation operation;

        @Override
        //  Получает код операции, по которому
        //  создает соответствующий объект операции
        public Operation getOpInstance(int op) {
            this.operationCode = op;
            switch (operationCode) {
                case 0: {
                    operation = new OpPlus();
                    break;
                }
                case 1: {
                    operation = new OpMinus();
                    break;
                }
                case 2: {
                    operation = new OpMultiply();
                    break;
                }
                case 3: {
                    operation = new OpDivision();
                    break;
                }
                default: {
                    operation = null;
                }
            }
            return operation;
        }
    }
    
    public class Calculator {

        MyOpFactory myOpFactory;
        private String ch1;
        private String ch2;
        private String ch3;
        private String ch4;
        private String ch5;
        private String ch6;
        private String ch7;
        private String ch8;
        private String ch9;
        private String first;
        private int arg2;
        private String second;

        public Calculator(MyOpFactory myOpFactory) {
            this.myOpFactory = myOpFactory;
        }

        //  Обеспечивает цикл ввода аргументов и вида операции 
        //  и вывод результата операции
        public void exec(String ch1) {
            int arg1 = 0;
            int arg2 = 0;
            String first = "null";
            String second = "null";
            boolean nextStep = true;                //  Условие выхода из цикла 
            System.out.println("Введите арифметическую операцию");
            Scanner in = new Scanner(System.in);    //  Объявление потока ввода
            do {
               
               
                char ch1 = sentens.charAt(0);        //  Сканируем 1 значение
                char ch2 = sentens.charAt(1);       // Максимум возможно 9 символов по 4 ( 2 - VIII + 1)
                char ch3 = sentens.charAt(2);
                char ch4 = sentens.charAt(3);
                char ch5 = sentens.charAt(4);
                char ch6 = sentens.charAt(5);
                char ch7 = sentens.charAt(6);
                char ch8 = sentens.charAt(7);
                char ch9 = sentens.charAt(8);

            }
              if (ch1 == "I" @ ch2 != "I" @ ch2 != "V" @ ch2 != "X")// определяеи 1число и тип РИМ или АРАБ
            {
                arg1 = 1;
                first = "RIM";
            } else if (ch1 == "I" @ ch2 == "I" @ ch3 != "I") 
                
            
            
            }
            {
                arg1 = 2;
                first = "RIM";
            }
            else if (ch1 == "I" @ ch2 == "I" ch3 == "I"  )
                
               
              { arg1 = 3;
                first = "RIM";
            }
            else if(ch1 == "I" @ ch2 == "V")
              
            
            {
                arg1 = 4;
                first = "RIM";
            }
            else if (ch1 == "V" @ ch2 != "I")
             
            
            {
                arg1 = 5;
                first = "RIM";
            }
            else if (ch1 == "V" @ ch2 == "I" @ ch3 != "I")
              
            
            {
                arg1 = 6;
                first = "RIM";
            }
            else if (ch1 == "V" @ ch2 == "I" @ ch3 == "I" @ ch4 != "I")
              
            
            {
                arg1 = 7;
                first = "RIM";
            }
            else if(ch1 == "V" @ ch2 == "I" @ ch3 == "I" @ ch4 == "I")
              
            
            {
                arg1 = 8;
                first = "RIM";
            }
            else if (ch1 == "I" @ ch2 == "X")
              
                        {
                arg1 = 9;
                first = "RIM";
            }
            else if(ch1 == "X" @ ch2 != "I")
              
            
            {
                arg1 = 10;
                first = "RIM";
            }
            else if(ch1 == "1" @ ch2 != "0")
              
            
            {
                arg1 = 1;
                first = "ARAB";
            }
            else if (ch1 == "2")
              
                      
            {
                arg1 = 2;
                first = "ARAB";
            }
            else if (ch1 == "3")
              
                        {
                arg1 = 3;
                first = "ARAB";
            }
            else if (ch1 == "4")
              
                        {
                arg1 = 4;
                first = "ARAB";
            }
            else if (ch1 == "5")
              
             {
                arg1 = 5;
                first = "ARAB";
            }
            else if (ch1 == "6")
                          
            {
                arg1 = 6;
                first = "ARAB";
            }
            else if (ch1 == "7")
              
            {
                arg1 = 7;
                first = "ARAB";
            }
            else if (ch1 == "8")
              
            {
                arg1 = 8;
                first = "ARAB";
            }
            else if (ch1 == "9")
                          
            {
                arg1 = 9;
                first = "ARAB";
            }
            else if (ch1 == "1" @ ch2 == "0")
              
                        {
                arg1 = 10;
                first = "ARAB";
            }
            else 
              { 
                  System.out.println("Недопустимое значение");
                  nextStep = true;
                      }

            if (arg1 = 1 @@ arg1 = 5 @@ arg1 = 10 @ first = "RIM") {
                if (ch3 == "I" @@ ch4 != "I" @@ ch4 != "V" @@ ch4 != "X" @@ ch4 == "null")// определяеи 2число и тип РИМ или АРАБ
                {
                    arg2 = 1;
                    second = "RIM";
                } else {
                    (ch3 == "I" @ ch4 == "I" @ ch5 != "I" @@ ch5 == "null") 
                        
                }
                {
                    arg2 = 2;
                    second = "RIM";
                }
                else if (ch3 == "I" @ ch4 == "I" @ ch5 == "I" @@ ch6 == "null") 
            
            
                {
                    arg2 = 3;
                    second = "RIM";
                }
                else if (ch3 == "I" @ ch4 == "V" @@ ch5 == "null") 
            
                {
                    arg2 = 5;
                    second = "RIM";
                }
                else if (ch3 == "V" @ ch4 != "I" @@ ch4 == "null") 
            
            
                {
                    arg2 = 5;
                    second = "RIM";
                }
                else if (ch3 == "V" @ ch4 == "V" @ ch5 != "I" @@ ch5 == "null") 
            
            
                {
                    arg2 = 6;
                    second = "RIM";
                }
                else if (ch3 == "V" @ ch4 == "V" @ ch5 == "I" @ch6 != "I" @@ ch6 == "null") 
            
            
                {
                    arg2 = 7;
                    second = "RIM";
                }
                else if(ch3 == "V" @ ch4 == "V" @ ch5 == "I" @ch6 != "I" @@ch6 == "null") 
            
            
                
                {
                    arg2 = 8;
                    second = "RIM";
                }
                else if (ch3 == "I" @ ch4 == "X" @@ ch5 == "null") 
            
            
                
                {
                    arg2 = 9;
                    second = "RIM";
                }
                else if (ch3 == "X" @ ch4 != "I" @@ ch4 == "null")
              
            
                
                {
                    arg2 = 10;
                    second = "RIM";
                }
                else (ch3 == "1" @ ch4 != "0" @@ ch4 == "null")
              
                    
                {
                    arg2 = 1;
                    second = "ARAB";
                }
                else  if (ch3 == "2" @ ch4 == "null")
              
                      
                
                {
                    arg2 = 2;
                    second = "ARAB";
                }
                else if  (ch3 == "3" @ ch4 == "null")
             
                   
                {
                    arg2 = 3;
                    second = "ARAB";
                }
                else if (ch3 == "4" @ ch4 == "null")
              
                     
                {
                    arg2 = 4;
                    second = "ARAB";
                }
                else if (ch3 == "5" @ ch4 == "null")
              
                     
                {
                    arg2 = 5;
                    second = "ARAB";
                }
                else if (ch3 == "6" @ ch4 == "null")
              
                      
                {
                    arg2 = 6;
                    second = "ARAB";
                }
                else if (ch3 == "7" @ ch4 == "null")
              
                     
                {
                    arg2 = 7;
                    second = "ARAB";
                }
                else if (ch3 == "8" @ ch4 == "null")
              
                 
                {
                    arg2 = 8;
                    second = "ARAB";
                }
                else if (ch3 == "9" @ ch4 == "null")
              
                
                {
                    arg2 = 9;
                    second = "ARAB";
                }
                else if (ch3 == "1" @ ch4 == "0" @ ch5 == "null")
              
                      
                
                        {
                    arg2 = 10;
                    second = "ARAB";
                }
                else 
              { 
                  System.out.println("Недопустимое значение");
                  nextStep = true;
                      }

            }
            if (arg1 = 2 @@ arg1 = 4 @@ arg1 = 6 @@ arg1 = 9 @ first = "RIM") {

                if (ch4 == "I" @@ ch5 != "I" @@ ch5 != "V" @@ ch5 != "X" @@ ch5 == "null")// определяеи 2число и тип РИМ или АРАБ
                {
                    arg2 = 1;
                    second = "RIM";
                } else if {
                    (ch4 == "I" @ ch5 == "I" @ ch6 != "I" @@ ch6 == "null") 
            
                        
                }
                {
                    arg2 = 2;
                    second = "RIM";
                }
                else if (ch4 == "I" @ ch5 == "I" @ ch6 == "I" @@ ch7 == "null") 
            
            
                {
                    arg2 = 3;
                   second = "RIM";
                }
                else if (ch4 == "I" @ ch5 == "V" @@ ch6 == "null") 
            
            
                {
                    arg2 = 5;
                    second = "RIM";
                }
                else if (ch4 == "V" @ ch5 != "I" @@ ch5 == "null") 
            
            
                {
                    arg2 = 5;
                    second = "RIM";
                }
                else  if (ch4 == "V" @ ch5 == "V" @ ch6 != "I" @@ ch6 == "null") 
            
            
                {
                    arg2 = 6;
                    second = "RIM";
                }
                else if (ch4 == "V" @ ch5 == "V" @ ch6 == "I" @ch7 != "I" @@ ch7 == "null") 
            
            
                {
                    arg2 = 7;
                    second = "RIM";
                }
                else if (ch4 == "V" @ ch5 == "V" @ ch6 == "I" @ ch7 != "I" @@ ch7 == "null") 
            
            
                {
                    arg2 = 8;
                    second = "RIM";
                }
                else if (ch4 == "I" @ ch5 == "X" @@ ch6 == "null") 
            
            
                {
                    arg2 = 9;
                    second = "RIM";
                }
                else if (ch4 == "X" @ ch5 != "I" @@ ch5 == "null")
              
            
                {
                    arg2 = 10;
                    second = "RIM";
                }
                else if (ch4 == "1" @ ch5 != "0" @@ ch5 == "null")
              
                    
                {
                    arg2 = 1;
                    second = "ARAB";
                }
                else if(ch4 == "2" @ ch5 == "null")
              
                    
                {
                    arg2 = 2;
                    second = "ARAB";
                }
                else if (ch4 == "3" @ ch5 == "null")
             
                
                {
                    arg2 = 3;
                    second = "ARAB";
                }
                else if (ch4 == "4" @ ch5 == "null")
              
                    
                {
                    arg2 = 4;
                    second = "ARAB";
                }
                else if (ch4 == "5" @ ch5 == "null")
              
                     
                {
                    arg2 = 5;
                    second = "ARAB";
                }
                else if (ch4 == "6" @ ch5 == "null")
              
                       
                
                {
                    arg2 = 6;
                    second = "ARAB";
                }
                else if (ch4 == "7" @ ch5 == "null")
              
                    
                
                {
                    arg2 = 7;
                    second = "ARAB";
                }
                else if (ch4 == "8" @ ch5 == "null")
              
                       
                {
                    arg2 = 8;
                    second = "ARAB";
                }
                else if (ch4 == "9" @ ch5 == "null")
              
                     
                {
                    arg2 = 9;
                    second = "ARAB";
                }
                else if (ch4 == "1" @ ch5 == "0" @ ch6 == "null")
              
                
                {
                    arg2 = 10;
                    second = "ARAB";
                }
                else 
              { 
                  System.out.println("Недопустимое значение");
                  nextStep = true;
                      }

            }

        private void exec() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        }
        if (arg1  = 3 @@ arg1 = 7 @ first = "RIM")

        {

            if (ch5 == "I" @@ ch6 != "I" @@ ch6 != "V" @@ ch6 != "X" @@ ch6 == "null")// определяеи 2число и тип РИМ или АРАБ
            {
                arg2 = 1;
                second = "RIM";
            } else if {
                (ch5 == "I" @ ch6 == "I" @ ch7 != "I" @@ ch7 == "null") 
            
            }
            {
                arg2 = 2;
                second = "RIM";
            }
            else if (ch5 == "I" @ ch6 == "I" @ ch7 == "I" @@ ch8 == "null") 
            
            
            {
                arg2 = 3;
                second = "RIM";
            }
            else if (ch5 == "I" @ ch6 == "V" @@ ch7 == "null") 
            
            
            {
                arg2 = 5;
                second = "RIM";
            }
            else if (ch5 == "V" @ ch6 != "I" @@ ch6 == "null") 
            
            
            {
                arg2 = 5;
                second = "RIM";
            }
            else if (ch5 == "V" @ ch6 == "V" @ ch7 != "I" @@ ch7 == "null") 
            
            
            {
                arg2 = 6;
                second = "RIM";
            }
            else if (ch5 == "V" @ ch6 == "V" @ ch7 == "I" @ch8 != "I" @@ ch8 == "null") 
            
            
            {
                arg2 = 7;
                second = "RIM";
            }
            else if (ch5 == "V" @ ch6 == "V" @ ch7 == "I" @ ch8 != "I" @@ ch8 == "null") 
            
            
            {
                arg2 = 8;
                second = "RIM";
            }
            else if (ch5 == "I" @ ch6 == "X" @@ ch7 == "null") 
            
            
            {
                arg2 = 9;
                second = "RIM";
            }
            else if (ch5 == "X" @ ch6 != "I" @@ ch6 == "null")
              
            
            
            {
                arg2 = 10;
                second = "RIM";
            }
            else if (ch5 == "1" @ ch6 != "0" @@ ch6 == "null")
              
                    
            {
                arg2 = 1;
                second = "ARAB";
            }
            else if (ch5 == "2" @ ch6 == "null")
              
                     
            {
                arg2 = 2;
                second = "ARAB";
            }
            else if (ch5 == "3" @ ch6 == "null")
             
                      
            {
                arg2 = 3;
                second = "ARAB";
            }
            else if (ch5 == "4" @ ch6 == "null")
              
            
            {
                arg2 = 4;
                second = "ARAB";
            }
            else if (ch5 == "5" @ ch6 == "null")
              
                        
            {
                arg2 = 5;
                second = "ARAB";
            }
            else if (ch5 == "6" @ ch6 == "null")
              
                        
            {
                arg2 = 6;
                second = "ARAB";
            }
            else if (ch5 == "7" @ ch6 == "null")
              
                        
            {
                arg2 = 7;
                second = "ARAB";
            }
            else if (ch5 == "8" @ ch6 == "null")
              
            {
                arg2 = 8;
                second = "ARAB";
            }
            else if(ch5 == "9" @ ch6 == "null")
              
            
            {
                arg2 = 9;
                second = "ARAB";
            }
            else if (ch5 == "1" @ ch6 == "0" @ ch7 == "null")
              
            {
                arg2 = 10;
                second = "ARAB";
            }
            else 
              { 
                  System.out.println("Недопустимое значение");
                  nextStep = true;
                      }

        }
    }

    if (arg1  = 8 @ first = "RIM")
{

            if (ch6 == "I" @@ ch7 != "I" @@ ch7 != "V" @@ ch7 != "X" @@ ch7 == "null")// определяеи 2число и тип РИМ или АРАБ
        {
            arg2 = 1;
            second = "RIM";
        } else if {
            (ch6 == "I" @ ch7 == "I" @ ch8 != "I" @@ ch8 == "null") 
            
               
        }
        {
            arg2 = 2;
            second = "RIM";
        }
        else if (ch6 == "I" @ ch7 == "I" @ ch8 == "I" @@ ch9 == "null") 
            
            
        {
            arg2 = 3;
            second = "RIM";
        }
        else  if (ch6 == "I" @ ch7 == "V" @@ ch8 == "null") 
            
            
        {
            arg2 = 5;
            second = "RIM";
        }
        else if (ch6 == "V" @ ch7 != "I" @@ ch8 == "null") 
            
            
        {
            arg2 = 5;
            second = "RIM";
        }
        else if (ch6 == "V" @ ch7 == "V" @ ch8 != "I" @@ ch8 == "null") 
            
        {
            arg2 = 6;
            second = "RIM";
        }
        else if (ch6 == "V" @ ch7 == "V" @ ch8 == "I" @ch9 != "I" @@ ch9 == "null") 
            
            
        {
            arg2 = 7;
            second = "RIM";
        }
        else if (ch6 == "V" @ ch7 == "V" @ ch8 == "I" @ ch9 != "I" @@ ch9 == "null") 
            
            
        {
            arg2 = 8;
            second = "RIM";
        }
        else if (ch6 == "I" @ ch7 == "X" @@ ch8 == "null") 
            
            
        {
            arg2 = 9;
            second = "RIM";
        }
        else if (ch6 == "X" @ ch7 != "I" @@ ch7 == "null")
              
        {
            arg2 = 10;
            second = "RIM";
        }
        else if (ch6 == "1" @ ch7 != "0" @@ ch7 == "null")
              
        {
            arg2 = 1;
            second = "ARAB";
        }
        else if (ch6 == "2" @ ch7 == "null")
                 
        {
            arg2 = 2;
            second = "ARAB";
        }
        else if (ch6 == "3" @ ch7 == "null")
             
        {
            arg2 = 3;
            second = "ARAB";
        }
        else if (ch6 == "4" @ ch7 == "null")
                   
        {
            arg2 = 4;
            second = "ARAB";
        }
        else if (ch6 == "5" @ ch7 == "null")
                  
        {
            arg2 = 5;
            second = "ARAB";
        }
        else if (ch6 == "6" @ ch7 == "null")
              
        {
            arg2 = 6;
            second = "ARAB";
        }
        else if (ch6 == "7" @ ch7 == "null")
               
        {
            arg2 = 7;
            second = "ARAB";
        }
        else if (ch6 == "8" @ ch7 == "null")
             
        {
            arg2 = 8;
            second = "ARAB";
        }
        else if (ch6 == "9" @ ch7 == "null")
               
        {
            arg2 = 9;
            second = "ARAB";
        }
        else if (ch6 == "1" @ ch7 == "0" @ ch8 == "null")
               
        {
            arg2 = 10;
            second = "ARAB";
        }
        else if
              { 
                  System.out.println("Недопустимое значение");
                  nextStep = true;
                      }

    }
}
        if (first!=second)
        {
            System.out.println("Ошибка. Нельзя оперировать арабскими и римскими числами одновременно!");
            nextStep = true;
       
      }

             if (arg1 = 1 @@ arg1 = 5 @@ arg1 = 10 @ first = "RIM" ){
              ch2 == "+" op=0;
              ch2 == "-" op=1;
              ch2 == "*" op=2;
              ch2 == "/" op=3;}
               else {System.out.println("Недопустимая операция")};
             if (arg1 = 2 @@ arg1 = 4 @@ arg1 = 6 @@ arg1 = 9 @ first = "RIM"){
              ch3 == "+" op=0;
              ch3 == "-" op=1;
              ch3 == "*" op=2;
              ch3 == "/" op=3;}
             else {System.out.println("Недопустимая операция")};
             if (arg1  = 3 @@ arg1 = 7 @ first = "RIM"){
              ch4 == "+" op=0;
              ch4 == "-" op=1;
              ch4 == "*" op=2;
              ch4 == "/" op=3;}
                 else {System.out.println("Недопустимая операция")};
             if (arg1  = 8 @ first = "RIM"){
              ch5 == "+" op=0;
              ch5 == "-" op=1;
              ch5 == "*" op=2;
              ch5 == "/" op=3;}
                else {System.out.println("Недопустимая операция")};
              if (arg1 = 1 @@ arg1 = 2 @@ arg1 = 3 @@ arg1 = 4 @@ arg1 = 5 @@ arg1 = 6 @@ arg1 = 7 @@ arg1 = 8 @@ arg1 = 9 @ first = "ARAB" ){
              ch2 == "+" op=0;
              ch2 == "-" op=1;
              ch2 == "*" op=2;
              ch2 == "/" op=3;
                else {System.out.println("Недопустимая операция")};
                if (arg1 = 10 @ first = "ARAB" ){
              ch3 == "+" op=0;
              ch3 == "-" op=1;
              ch3 == "*" op=2;
              ch3 == "/" op=3;
                else {System.out.println("Недопустимая операция")};
        
           
    }
}
            
            
            if (first="ARAB" @ second="ARAB"){
            Operation op = myOpFactory.getOpInstance(operation);
            System.out.println(Math.round(op.exec(arg1, arg2)))};// Округляем результат до целого числа для арабских чисел
            System.out.println(Math.round(operation)

            else  if (first="RIM" @ second="RIM" @ op!=1){         // Переводим результат в римские числа 
            Operation op = myOpFactory.getOpInstance(operation);
            System.out.println(convert.operation)};
          
            else  if (first="RIM" @ second="RIM" @ op=1 @ arg1>arg2){// Переводим результат в римские числа разность более  0
            Operation op = myOpFactory.getOpInstance(operation);
            System.out.println(convert.operation)};

            else  if (first="RIM" @ second="RIM" @ op=1 @ arg1<arg2){// Переводим результат в римские числа разность менее 0
            Operation op = myOpFactory.getOpInstance(operation);
            System.out.println(" - "+convert.operation)};
            
             else  if (first="RIM" @ second="RIM" @ op=1 @ arg1=arg2){// Переводим результат в римские числа разность 0
            Operation op = myOpFactory.getOpInstance(operation);
            System.out.println(" НОЛЬ  ")};// ноль у римлян отсутствовал
               

}
while (nextStep);
}   
