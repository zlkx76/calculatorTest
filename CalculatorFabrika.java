package calculator;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


    /* Основной CalculatorFabrika (запускаемый) класс программы должен создать экземпляр класса
     MyOpFactory, создать экземпляр класса Calculator, передав ему в качестве 
     параметра объект MyOpFactory и выполнить метод exec созданного объекта
     Calculator.
     */
    public class CalculatorFabrika {

        public static  void main(String[] args) {
            //  Создаем экземпляр класса MyOpFactory
            MyOpFactory myOpFactory = new MyOpFactory();
            //  Создаем экземпляр класса Calculator 
            //  с агрументом в виде объекта MyOpFactory
            //  СОЗДАЕТ КАЛЬКУЛЯТОР
            int arg1=1;
            int arg2=1;
            
            Calculator calc = new Calculator(myOpFactory);
            //  Выполняем метод exec для объекта CalculatorRIM
            //  ЗАПУСКАЕМ КАЛЬКУЛЯТОР
            calc.exec(arg1, arg2);
        }
    }
    /*
     Интерфейс Operation олицетворяет классы, выполняющие некую операцию над
     двумя аргументами.
     */

    interface Operation {

        int exec(int arg1, int arg2);
    }
    /*
     Создайте реализации интерфейса Operation для операций сложения, вычитания,
     умножения, деления (OpPlus, OpMinus, OpMul, OpDiv соответственно). 
     */
//  Операция СУММA

    class OpPlus implements Operation {

        @Override
        public int exec(int arg1, int arg2) {
            return (arg1 + arg2);
        }
    }
//  Операция РАЗНОСТЬ

    class OpMinus implements Operation {

        @Override
        public int exec(int arg1, int arg2) {
            return (arg1 - arg2);
        }
    }
//  Операция ПРОИЗВЕДЕНИЕ

    class OpMultiply implements Operation {

        @Override
        public int exec(int arg1, int arg2) {
            return (arg1 * arg2);
        }
    }
//  Операция ДЕЛЕНИЯ

    class OpDivision implements Operation {

        @Override
        public int exec(int arg1, int arg2) {
            return Math.round(arg1 / arg2);
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
        public Operation getOpInstance(int opCode) {
            this.operationCode = opCode;
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
    
     class Calculator {
    private final MyOpFactory myOpFactory;
    private char ch1;
    private char ch2;
    private char ch3;
    private char ch4;
    private char ch5;
    private char ch6;
    private char ch7;
    private char ch8;
    private char ch9;
    private char ch10;
    private int op;
    public int operation;

              

        public Calculator(MyOpFactory myOpFactory) {
            this.myOpFactory = myOpFactory;
        }
 
        //  Обеспечивает цикл ввода аргументов и вида операции 
        //  и вывод результата операции
        public void exec(int arg1, int arg2) {
            int first = 0;
            int second = 0;
            boolean nextStep = true;                //  Условие выхода из цикла 
            
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
            Scanner in = new Scanner(System.in);  
            System.out.println("Введите арифметическую выражение");
            String phrase1 = in.nextLine();
		
            ch1 = in.next().charAt(0);
             ch2 = in.next().charAt(1);
             ch3 = in.next().charAt(2);
             ch4 = in.next().charAt(3);
             ch5 = in.next().charAt(4);
             ch6 = in.next().charAt(5);
             ch7 = in.next().charAt(6);
             ch8 = in.next().charAt(7);
             ch9 = in.next().charAt(8);
            
            do {
               
               
                            
              if ((ch1 == 'I') && (ch2 != 'I') && (ch2 != 'V') && (ch2 != 'X'))// определяеи 1число и тип РИМ или АРАБ
            {
                arg1 = 1;
                first = 1;
                } else if (ch1 == 'I' && ch2 == 'I' && ch3 != 'I'){ 
                
                     arg1 = 2;
                     first = 1;
                    } else if (ch1 == 'I' && ch2 == 'I'&& ch3== 'I' ) {
                
                     arg1 = 3;
                     first = 1;
                    } else if(ch1 == 'I' && ch2 == 'V') {
                         arg1 = 4;
                         first = 1;
                     } else if (ch1 == 'V' && ch2 != 'I'){
            
                      arg1 = 5;
                         first = 1;
                        }
            else if (ch1 == 'V' && ch2 == 'I' && ch3 != 'I')
              
            {
                arg1 = 6;
                first = 1;
            }
            else if (ch1 == 'V' && ch2 == 'I' && ch3 == 'I' && ch4 != 'I')
              
            
            {
                arg1 = 7;
                first = 1;
            }
            else if(ch1 == 'V' && ch2 == 'I' && ch3 == 'I' && ch4 == 'I')
              
            
            {
                arg1 = 8;
                first = 1;
            }
            else if (ch1 == 'I' && ch2 == 'X')
              
                        {
                arg1 = 9;
                first = 1;
            }
            else if((ch1 == 'X') && (ch2 != 'I'))
              
            
            {
                arg1 = 10;
                first = 1;
            }
            else if(ch1 == '1' && ch2 != '0')
              
            
            {
                arg1 = 1;
                first = 2;
            }
            else if (ch1 == '2')
              
                      
            {
                arg1 = 2;
                first = 2;
            }
            else if (ch1 == '3')
              
                        {
                arg1 = 3;
                first = 2;
            }
            else if (ch1 == '4')
              
                        {
                arg1 = 4;
                first = 2;
            }
            else if (ch1 == '5')
              
             {
                arg1 = 5;
                first = 2;
            }
            else if (ch1 == '6')
                          
            {
                arg1 = 6;
                first = 2;
            }
            else if (ch1 == '7')
              
            {
                arg1 = 7;
                first = 2;
            }
            else if (ch1 == '8')
              
            {
                arg1 = 8;
                first = 2;
            }
            else if (ch1 == '9')
                          
            {
                arg1 = 9;
                first = 2;
            }
            else if (ch1 == '1' && ch2 == '0')
              
                        {
                arg1 = 10;
                first = 2;
            }
            else 
              { 
                  System.out.println("Недопустимое значение");
                  nextStep = false;
                      }
            
            
            if ((arg1 == 1 | arg1 == 5 | arg1 == 10) && first == 1) {
                if (ch3 == 'I' && (ch4 != 'I' | ch4 != 'V' | ch4 != 'X' | ch4 == ' '))// определяеи 2число и тип РИМ или АРАБ
                {
                    arg2 = 1;
                    second = 1;
                } else if 
                    (ch3 == 'I' && ch4 == 'I' && ( ch5 != 'I' | ch5 == ' ')) 
                        
                
                {
                    arg2 = 2;
                    second = 1;
                }
                else if (ch3 == 'I' && ch4 == 'I' && ch5 == 'I'&& ch6 == ' ' ) 
            
            
                {
                    arg2 = 3;
                    second = 1;
                }
                else if (ch3 == 'I' && ch4 == 'V' && ch5 == ' ') 
            
                {
                    arg2 = 5;
                    second = 1;
                }
                else if (ch3 =='V' && ch4 != 'I' && ch5 == ' ') 
            
            
                {
                    arg2 = 5;
                    second = 1;
                }
                else if (ch3 == 'V' && ch4 == 'I' && (ch5 != 'I' | ch5 == ' ')) 
            
            
                {
                    arg2 = 6;
                    second = 1;
                }
                else if (ch3 == 'V' && ch4 == 'I' && ch5 == 'I' && (ch6 != 'I' | ch6 == ' ')) 
            
            
                {
                    arg2 = 7;
                    second = 1;
                }
                else if(ch3 == 'V' && ch4 == 'I' && ch5 == 'I' && (ch6 != 'I' | ch6 == ' ')) 
            
            
                
                {
                    arg2 = 8;
                    second = 1;
                }
                else if (ch3 == 'I' && ch4 == 'X' && ch5 == ' ') 
            
                            
                {
                    arg2 = 9;
                    second = 1;
                }
                else if (ch3 == 'X' && (ch4 != 'I' | ch4 == ' '))
              
                           
                {
                    arg2 = 10;
                    second = 1;
                }
                else if (ch3 == '1' && ch4 != '0' && ch5 == ' ')
              
                    
                {
                    arg2 = 1;
                    second = 2;
                }
                else  if (ch3 == '2' && ch4 == ' ')
              
                                   
                {
                    arg2 = 2;
                    second = 2;
                }
                else if  (ch3 == '3' && ch4 == ' ')
             
                   
                {
                    arg2 = 3;
                    second = 2;
                }
                else if (ch3 == '4' && ch4 == ' ')
              
                     
                {
                    arg2 = 4;
                    second = 2;
                }
                else if (ch3 == '5' && ch4 == ' ')
              
                     
                {
                    arg2 = 5;
                    second = 2;
                }
                else if (ch3 == '6' && ch4 == ' ')
              
                      
                {
                    arg2 = 6;
                    second = 2;
                }
                else if (ch3 == '7' && ch4 == ' ')
              
                     
                {
                    arg2 = 7;
                    second = 2;
                }
                else if (ch3 == '8' && ch4 == ' ')
              
                 
                {
                    arg2 = 8;
                    second = 2;
                }
                else if (ch3 == '9' && ch4 == ' ')
              
                
                {
                    arg2 = 9;
                    second = 2;
                }
                else if (ch3 == '1' && ch4 == '0' && ch5 == ' ')
              
                
                        {
                    arg2 = 10;
                    second = 2;
                }
                else 
              { 
                  System.out.println("Недопустимое значение");
                  nextStep = true;
                      }

            }
            if (arg1 == 2  | arg1 == 4 | arg1 == 6 | arg1 == 9 ) {

                if (ch4 == 'I' && ch5 != 'I' && ch5 != 'V' && ch5 != 'X' )// определяеи 2число и тип РИМ или АРАБ
                {
                    arg2 = 1;
                    second = 1;
                } else if 
                    (ch4 == 'I' && ch5 == 'I' && ch6 != 'I') 
            
                        
                {
                    arg2 = 2;
                    second = 1;
                }
                else if (ch4 == 'I' && ch5 == 'I' && ch6 == 'I' && ch7 == ' ') 
            
            
                {
                    arg2 = 3;
                   second = 1;
                }
                else if (ch4 == 'I' && ch5 == 'V' && ch6 == ' ') 
            
                            {
                    arg2 = 4;
                    second = 1;
                }
                else if (ch4 == 'V' && ( ch5 != 'I' | ch5 == ' ' )) 
            
            
                {
                    arg2 = 5;
                    second = 1;
                }
                else  if (ch4 == 'V' && ch5 == 'I' && (ch6 != 'I' | ch6 == ' ')) 
            
            
                {
                    arg2 = 6;
                    second = 1;
                }
                else if (ch4 == 'V' && ch5 == 'I' && ch6 == 'I' && (ch7 != 'I' | ch7 == ' ')) 
            
            
                {
                    arg2 = 7;
                    second = 1;
                }
                else if (ch4 == 'V' && ch5 == 'I' && ch6 == 'I' && ch7 != 'I' && ch8 == ' ') 
            
            
                {
                    arg2 = 8;
                    second = 1;
                }
                else if (ch4 == 'I' && ch5 == 'X' && ch6 == ' ') 
            
            
                {
                    arg2 = 9;
                    second = 1;
                }
                else if (ch4 == 'X' && ch5 == ' ')
              
            
                {
                    arg2 = 10;
                    second = 1;
                }
                else if (ch4 == '1' && (ch5 != '0' | ch5 == ' '))
              
                    
                {
                    arg2 = 1;
                    second = 2;
                }
                else if(ch4 == '2' && ch5 == ' ')
              
                    
                {
                    arg2 = 2;
                    second = 2;
                }
                else if (ch4 == '3' && ch5 == ' ')
             
                
                {
                    arg2 = 3;
                    second = 2;
                }
                else if (ch4 == '4' && ch5 == ' ')
              
                    
                {
                    arg2 = 4;
                    second = 2;
                }
                else if (ch4 == '5' && ch5 == ' ')
              
                     
                {
                    arg2 = 5;
                    second = 2;
                }
                else if (ch4 == '6' && ch5 == ' ')
              
                       
                
                {
                    arg2 = 6;
                    second = 2;
                }
                else if (ch4 == '7' && ch5 == ' ')
              
                    
                
                {
                    arg2 = 7;
                    second = 2;
                }
                else if (ch4 == '8' && ch5 == ' ')
              
                {
                    arg2 = 8;
                    second = 2;
                }
                else if (ch4 == '9' && ch5 == ' ')
              
                     
                {
                    arg2 = 9;
                    second = 2;
                }
                else if (ch4 == '1' && ch5 == '0' && ch6 == ' ')
              
                
                {
                    arg2 = 10;
                    second = 2;
                }
                else 
              { 
                  System.out.println("Недопустимое значение");
                  nextStep = true;
                      }

            }
       
        
        if (first == 1 && (arg1  == 3 | arg1 ==7))
                

        {
            if (ch5 == 'I' && ch6 != 'I' && ch6 != 'V' && ch6 != 'X' && ch7 == ' ')// определяеи 2число и тип РИМ или АРАБ
            {
                arg2 = 1;
                second = 1;
            } else if
                    (ch5 == 'I' && ch6 == 'I' && ch7 != 'I' && ch8 == ' ')
                
            {
                arg2 = 2;
                second = 1;
            }
            
            
            if (ch5 == 'I' && ch6 == 'I' && ch7 == 'I' && ch8 == ' ')
                
                
            {
                arg2 = 3;
                second = 1;
            }
            else if (ch5 == 'I' && ch6 == 'V' && ch7 == ' ')
                
                
            {
                arg2 = 5;
                second = 1;
            }
            else if (ch5 == 'V' && ch6 != 'I' && ch7 == ' ')
                
                
            {
                arg2 = 5;
                second = 1;
            }
            else if (ch5 == 'V' && ch6 == 'I' &&(ch7 != 'I' | ch7 == ' '))
                
                
            {
                arg2 = 6;
                second = 1;
            }
            else if (ch5 == 'V' && ch6 == 'I' && ch7 == 'I' && (ch8 != 'I' | ch8 == ' '))
                
                
            {
                arg2 = 7;
                second = 1;
            }
            else if (ch5 == 'V' && ch6 == 'I' && ch7 == 'I' && (ch8 != 'I' | ch8 == ' '))
                
                
            {
                arg2 = 8;
                second = 1;
            }
            else if (ch5 == 'I' && ch6 == 'X' && ch7 == ' ')
                
                
            {
                arg2 = 9;
                second = 1;
            }
            else if (ch5 == 'X' && ch6 == ' ')
              
            {
                arg2 = 10;
                second = 1;
            }
            else if (ch5 == '1' && (ch6 != '0' | ch6 == ' '))
                
                
            {
                arg2 = 1;
                second = 2;
            }
            else if (ch5 == '2' && ch6 == ' ')
                
                
            {
                arg2 = 2;
                second = 2;
            }
            else if (ch5 == '3' && ch6 == ' ')
                
                
            {
                arg2 = 3;
                second = 2;
            }
            else if (ch5 == '4' && ch6 == ' ')
                
                
            {
                arg2 = 4;
                second = 2;
            }
            else if (ch5 == '5' && ch6 == ' ')
                
                
            {
                arg2 = 5;
                second = 2;
            }
            else if (ch5 == '6' && ch6 == ' ')
                
                
            {
                arg2 = 6;
                second = 2;
            }
            else if (ch5 == '7' && ch6 == ' ')
                
                
            {
                arg2 = 7;
                second = 2;
            }
            else if (ch5 == '8' && ch6 == ' ')
              
            {
                arg2 = 8;
                second = 2;
            }
            else if(ch5 == '9' && ch6 == ' ')
                
                
            {
                arg2 = 9;
                second = 2;
            }
            else if (ch5 == '1' && ch6 == '0' && ch7 == ' ')
              
            {
                arg2 = 10;
                second = 2;
            }
            else
            {
                System.out.println("Недопустимое значение");
                nextStep = false;
            }
        } 
    

        else if (arg1  == 8 && first == 1)
{

            if (ch6 == 'I' && ch7 != 'I' && ch7 != 'V' && ch7 != 'X' && ch8 == ' ')// определяеи 2число и тип РИМ или АРАБ
        {
            arg2 = 1;
            second = 1;
        } else if 
            (ch6 == 'I' && ch7 == 'I' && ch8 != 'I' && ch9 == ' ') 
            
               
        
        {
            arg2 = 2;
            second = 1;
        }
        else if (ch6 == 'I' && ch7 == 'I' && ch8 == 'I' && ch9 ==  ' ') 
            
            
        {
            arg2 = 3;
            second = 1;
        }
        else  if (ch6 == 'I' && ch7 == 'V' && ch8 == ' ') 
            
            
        {
            arg2 = 5;
            second = 1;
        }
        else if (ch6 == 'V' && ch7 != 'I' && ch8 == ' ') 
            
            
        {
            arg2 = 5;
            second = 1;
        }
        else if (ch6 == 'V' && ch7 == 'I' && ch8 != 'I' && ch8 == ' ') 
            
        {
            arg2 = 6;
            second = 1;
        }
        else if (ch6 == 'V' && ch7 == 'I' && ch8 == 'I' && (ch9 != 'I' | ch9 == ' ')) 
            
            
        {
            arg2 = 7;
            second = 1;
        }
        else if (ch6 == 'V' && ch7 == 'I' && ch8 == 'I' && ch9 == 'I' && ch10 == ' ') 
            
            
        {
            arg2 = 8;
            second = 1;
        }
        else if (ch6 == 'I' && ch7 == 'X' && ch8 == ' ') 
            
            
        {
            arg2 = 9;
            second = 1;
        }
        else if (ch6 == 'X' && (ch7 != 'I' | ch7 == ' '))
              
        {
            arg2 = 10;
            second = 1;
        }
        else if (ch6 == '1' && (ch7 != '0' | ch7 == ' '))
              
        {
            arg2 = 1;
            second = 2;
        }
        else if (ch6 == '2' && ch7 == ' ')
                 
        {
            arg2 = 2;
            second = 2;
        }
        else if (ch6 == '3' && ch7 == ' ')
             
        {
            arg2 = 3;
            second = 2;
        }
        else if (ch6 == '4' && ch7 == ' ')
                   
        {
            arg2 = 4;
            second = 2;
        }
        else if (ch6 == '5' && ch7 == ' ')
                  
        {
            arg2 = 5;
            second = 2;
        }
        else if (ch6 == '6' && ch7 == ' ')
              
        {
            arg2 = 6;
            second = 2;
        }
        else if (ch6 == '7' && ch7 == ' ')
               
        {
            arg2 = 7;
            second = 2;
        }
        else if (ch6 == '8' && ch7 == ' ')
             
        {
            arg2 = 8;
            second = 2;
        }
        else if (ch6 == '9' && ch7 == ' ')
               
        {
            arg2 = 9;
            second = 2;
        }
        else if (ch6 == '1' && ch7 == '0' && ch8 == ' ')
               
        {
            arg2 = 10;
            second = 2;
        }
        else 
        {
                  System.out.println("Недопустимое значение");
                  nextStep = false;
                  }

    }

        if (first!=second)
        {
            System.out.println("Ошибка. Нельзя оперировать арабскими и римскими числами одновременно!");
            nextStep = false;
       
      }

             else if ((arg1 == 1 | arg1 == 5 | arg1 == 10) && first == 1 ){
                 if (ch2 == '+') 
                         {operation=0;}
                 else if (ch2 == '-')
                 {operation=1;}
                 else if (ch2 == '*')
                 {operation=2;}
                 else if (ch2 == '/')
                 {operation=3;}
               else {System.out.println("Недопустимая операция");}}
             if ((arg1 == 2 | arg1 == 4 | arg1 == 6 | arg1 == 9) && first == 1){
                if (ch3 == '+') 
                         {operation=0;}
                 else if (ch3 == '-')
                 {operation=1;}
                 else if (ch3 == '*')
                 {operation=2;}
                 else if (ch3 == '/')
                {operation=3;}
             else {System.out.println("Недопустимая операция");}
             if (arg1  == 3 | arg1 == 7 && first == 1){
              if (ch4 == '+') 
                         {operation=0;}
                 else if (ch4 == '-')
                 {operation=1;}
                 else if (ch4 == '*')
                 {operation=2;}
                 else if (ch4 == '/')
                 {operation=3;}
                 else {System.out.println("Недопустимая операция");}
             if (arg1  == 8 && first == 1){
              if (ch5 == '+') 
                         {operation=0;}
                 else if (ch5 == '-')
                 {operation=1;}
                 else if (ch5 == '*')
                 {operation=2;}
                 else if (ch5 == '/')
                 {operation=3;}}
                else {System.out.println("Недопустимая операция");}
              if ((arg1 == 1 | arg1 == 2 | arg1 == 3 | arg1 == 4 | arg1 == 5 | arg1 == 6 | arg1 == 7 | arg1 == 8 | arg1 == 9) && first == 2 ){
                if (ch2 == '+') 
                         {operation=0;}
                 else if (ch2 == '-')
                 {operation=1;}
                 else if (ch2 == '*')
                 {operation=2;}
                 else if (ch2 == '/')
                 {operation=3;}}
                else {System.out.println("Недопустимая операция");}
                if (arg1 == 10 && first == 2 ){
                 if (ch2 == '+')
                 {operation=0;}
                 else if (ch2 == '-')
                 {operation=1;}
                 else if (ch2 == '*')
                 {operation=2;}
                 else if (ch2 == '/')
                 {operation=3;}}
                else {System.out.println("Недопустимая операция");}
        
           
    }
}
            
            
            if (first == 2 && second == 2){
            Operation op;
                  op = myOpFactory.getOpInstance(operation);
            System.out.println(Math.round(myOpFactory.getOpInstance(operation).exec(arg1, arg2)));// Округляем результат до целого числа для арабских чисел
            }

            else  if (first == 1 && second==1 && op!=1){         // Переводим результат в римские числа 
            Operation op;
                    op = myOpFactory.getOpInstance(operation);
            System.out.println(Convert.operand(myOpFactory.getOpInstance(operation).exec(arg1, arg2)));}
          
            else  if (first == 1 && second==1 && op==1 && arg1>arg2){// Переводим результат в римские числа разность более  0
            Operation op;
                    op = myOpFactory.getOpInstance(operation);
            System.out.println(Convert.operand(myOpFactory.getOpInstance(operation).exec(arg1, arg2)));}

            else  if (first == 1 && second==1 && op==1 && arg1<arg2){// Переводим результат в римские числа разность менее 0
            Operation op = myOpFactory.getOpInstance(operation);
            System.out.println(" - " + Convert.operand(myOpFactory.getOpInstance(operation).exec(arg1, arg2)));}
            
             else  if (first == 1 && second==1 && op==1 && arg1==arg2){// Переводим результат в римские числа разность 0
             System.out.println(" НОЛЬ  ");}// ноль у римлян отсутствовал
               
 
            }
            while (nextStep);
     }

    
    }
       

    