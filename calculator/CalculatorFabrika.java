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
   
     Создаём реализацию интерфейса OperationFactory, создающую перечисленные выше
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
                    operation = new   OpMinus();
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
   /* private char ch[1];
    private char ch[2];
    private char ch[3];
    private char ch[4];
    private char ch[5];
    private char ch[6];
    private char ch[7];
    private char ch[8];
    private char ch[9];
    private char ch[1]0;*/
    private int op;
    public int operation;
    private int i;

    
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
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            System.out.println("Введите арифметическую выражение");
           Scanner in = new Scanner(System.in);  
            String s= in.nextLine();
           
            int numberOfChars =s.length();
            char [ ] ch =new char [numberOfChars];
            for (int i=0; i<numberOfChars; i++){
                ch[i]=s.charAt(i);
            }
            
      /*  char ch[1] = s.charAt(0);
        char ch[2] = s.charAt(1);
        char ch[3] = s.charAt(2);
        char ch[4] = s.charAt(3);
        char ch[5] = s.charAt(4);
        char ch[6] = s.charAt(5);
        char ch[7] = s.charAt(6);
        char ch[8] = s.charAt(7);
        //char ch[9] = s.charAt(8);
        //char ch[1]0 = s.charAt(9);
         */  
                       
            do {
               switch ((i/1)) {
			case 3:
				if ((ch[1] == 'I') && (ch[2] != 'I') && (ch[2] != 'V') && (ch[2] != 'X'))// определяеи 1число и тип РИМ или АРАБ
                                                                {
                                                                    arg1 = 1;
                                                                    first = 1;
                                                                    }
                                                                 else if (ch[1] == 'V' && ch[2] != 'I'){
            
                                                                    arg1 = 5;
                                                                    first = 1;
                                                                      }
                                                                   else if((ch[1] == 'X') && (ch[2] != 'I'))
              
                                                                    {
                                                                        arg1 = 10;
                                                                        first = 1;
                                                                    } 
                                                                    else if(ch[1] == '1' && ch[2] != '0')
                          
                                                                    {
                                                                        arg1 = 1;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[1] == '2')

                                                                    {
                                                                        arg1 = 2;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[1] == '3')

                                                                    {
                                                                        arg1 = 3;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[1] == '4')

                                                                    {
                                                                        arg1 = 4;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[1] == '5')

                                                                     {
                                                                        arg1 = 5;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[1] == '6')

                                                                    {
                                                                        arg1 = 6;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[1] == '7')

                                                                    {
                                                                        arg1 = 7;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[1] == '8')

                                                                    {
                                                                        arg1 = 8;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[1] == '9')

                                                                    {
                                                                        arg1 = 9;
                                                                        first = 2;
                                                                    }
                                                                     if (ch[3] == 'I')
                                                                    {
                                                                        arg2 = 1;
                                                                        second = 1;
                                                                    }
                                                                     else if (ch[3] == 'V')

                                                                    {
                                                                        arg1 = 5;
                                                                       second = 1;
                                                                    }
                                                                     else if (ch[3] == 'X')

                                                                    {
                                                                        arg1 = 10;
                                                                       second = 1;
                                                                    } 
                                                                     else if(ch[3] == '1' )
                          
                                                                    {
                                                                        arg1 = 1;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[3] == '2')

                                                                    {
                                                                        arg1 = 2;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[3] == '3')

                                                                    {
                                                                        arg1 = 3;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[3] == '4')

                                                                    {
                                                                        arg1 = 4;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[3] == '5')

                                                                     {
                                                                        arg1 = 5;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[3] == '6')

                                                                    {
                                                                        arg1 = 6;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[3] == '7')

                                                                    {
                                                                        arg1 = 7;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[3] == '8')

                                                                    {
                                                                        arg1 = 8;
                                                                        first = 2;
                                                                    }
                                                                    else if (ch[3] == '9')

                                                                    {
                                                                        arg1 = 9;
                                                                        first = 2;
                                                                    }
                                                                     else 
                                                                    { 
                                                                        System.out.println("Недопустимое значение");
                                                                        nextStep = false;
                                                                    } 
                                                                    if (ch[2] == '+') 
                                                                            {operation=0;}
                                                                    else if (ch[2] == '-')
                                                                    {operation=1;}
                                                                    else if (ch[2] == '*')
                                                                    {operation=2;}
                                                                    else if (ch[2] == '/')
                                                                    {operation=3;}
                                                                    else  {System.out.println("Недопустимая операция");}
                                                                   
				break;
                            
                            
			case 4:
				if ((ch[1] == 'I') && (ch[2] != 'I') && (ch[2] != 'V') && (ch[2] != 'X'))// определяеи 1число и тип РИМ или АРАБ
                                                                {
                                                                    arg1 = 1;
                                                                    first = 1;
                                                                    }
                                                                else if (ch[1] == 'I' && ch[2] == 'I' && ch[3] != 'I')
                                                                {
                                                                arg1 = 2;
                                                                first = 1;
                                                                }
                                                                 else if (ch[1] == 'I' && ch[2] == 'I'&& ch[3]== 'I' ) {
                
                                                                arg1 = 3;
                                                                first = 1;
                                                               }
                                                                else if(ch[1] == 'I' && ch[2] == 'V') {
                                                                arg1 = 4;
                                                                first = 1;
                                                                 } 
                                                                else if (ch[1] == 'V' && ch[2] != 'I'){

                                                                arg1 = 5;
                                                                first = 1;
                                                               }
                                                               else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] != 'I')

                                                                {
                                                                    arg1 = 6;
                                                                    first = 1;
                                                                }
                                                                 
                                                                 else if (ch[1] == 'I' && ch[2] == 'X')
              
                                                                {
                                                                    arg1 = 9;
                                                                    first = 1;
                                                                }
                                                                else if((ch[1] == 'X') && (ch[2] != 'I'))

                                                                {
                                                                    arg1 = 10;
                                                                    first = 1;
                                                                }
                                                                else if(ch[1] == '1' && ch[2] != '0')
              
                                                                {
                                                                    arg1 = 1;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '2')

                                                                {
                                                                    arg1 = 2;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '3')

                                                                            {
                                                                    arg1 = 3;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '4')

                                                                            {
                                                                    arg1 = 4;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '5')

                                                                 {
                                                                    arg1 = 5;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '6')

                                                                {
                                                                    arg1 = 6;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '7')

                                                                {
                                                                    arg1 = 7;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '8')

                                                                {
                                                                    arg1 = 8;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '9')

                                                                {
                                                                    arg1 = 9;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '1' && ch[2] == '0')

                                                                 {
                                                                    arg1 = 10;
                                                                    first = 2;
                                                                }
                                                                 else 
                                                                { 
                                                                    System.out.println("Недопустимое значение");
                                                                    nextStep = false;
                                                                }
                                                                   if ((arg1 == 1 | arg1 == 5 | arg1 == 10) && first == 1 ){
                                                                    if (ch[2] == '+') 
                                                                            {operation=0;}
                                                                    else if (ch[2] == '-')
                                                                    {operation=1;}
                                                                    else if (ch[2] == '*')
                                                                    {operation=2;}
                                                                    else if (ch[2] == '/')
                                                                    {operation=3;}
                                                                  else {System.out.println("Недопустимая операция");}}
                                                                if ((arg1 == 2 | arg1 == 4 | arg1 == 6 | arg1 == 9) && first == 1){
                                                                   if (ch[3] == '+') 
                                                                            {operation=0;}
                                                                    else if (ch[3] == '-')
                                                                    {operation=1;}
                                                                    else if (ch[3] == '*')
                                                                    {operation=2;}
                                                                    else if (ch[3] == '/')
                                                                   {operation=3;}
                                                                else {System.out.println("Недопустимая операция");}
                                                                 }
                                                                  if ((arg1 == 1 | arg1 == 2 | arg1 == 3 | arg1 == 4 | arg1 == 5 | arg1 == 6 | arg1 == 7 | arg1 == 8 | arg1 == 9) && first == 2 ){
                                                                 if (ch[2] == '+') 
                                                                         {operation=0;}
                                                                 else if (ch[2] == '-')
                                                                 {operation=1;}
                                                                 else if (ch[2] == '*')
                                                                 {operation=2;}
                                                                 else if (ch[2] == '/')
                                                                 {operation=3;}}
                                                                else {System.out.println("Недопустимая операция");}
                                                                if (arg1 == 10 && first == 2 ) {
                                                                 if (ch[3] == '+')
                                                                 {operation=0;}
                                                                 else if (ch[3] == '-')
                                                                 {operation=1;}
                                                                 else if (ch[3] == '*')
                                                                 {operation=2;}
                                                                 else if (ch[3] == '/')
                                                                 {operation=3;}}
                                                                else {System.out.println("Недопустимая операция");}
                                                                if ((arg1 == 1 | arg1 == 5 | arg1 == 10) && first == 1 ){
                                                                if (ch[2] == '+') 
                                                                        {operation=0;}
                                                                else if (ch[2] == '-')
                                                                {operation=1;}
                                                                else if (ch[2] == '*')
                                                                {operation=2;}
                                                                else if (ch[2] == '/')
                                                                {operation=3;}
                                                              else {System.out.println("Недопустимая операция");}}
                                                              if ((arg1 == 2 | arg1 == 4 | arg1 == 6 | arg1 == 9) && first == 1){
                                                               if (ch[3] == '+') 
                                                                        {operation=0;}
                                                                else if (ch[3] == '-')
                                                                {operation=1;}
                                                                else if (ch[3] == '*')
                                                                {operation=2;}
                                                                else if (ch[3] == '/')
                                                               {operation=3;}
                                                               else {System.out.println("Недопустимая операция");}}
            
				break;
                                
                                                     case 5:  
                                                                if (ch[1] == 'I' && ((ch[2] != 'I') | (ch[2] != 'V') | (ch[2] != 'X')))// определяеи 1число и тип РИМ или АРАБ
                                                                {
                                                                    arg1 = 1;
                                                                    first = 1;
                                                                    }
                                                                else if (ch[1] == 'I' && ch[2] == 'I' && ch[3] != 'I')
                                                                {
                                                                arg1 = 2;
                                                                first = 1;
                                                                }
                                                                else if (ch[1] == 'I' && ch[2] == 'I'&& ch[3]== 'I' ) {
                
                                                                arg1 = 3;
                                                                first = 1;
                                                               }
                                                                else if(ch[1] == 'I' && ch[2] == 'V') {
                                                                arg1 = 4;
                                                                first = 1;
                                                                 } 
                                                                else if (ch[1] == 'V' && ch[2] != 'I'){

                                                                arg1 = 5;
                                                                first = 1;
                                                               }
                                                               else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] != 'I')

                                                                {
                                                                    arg1 = 6;
                                                                    first = 1;
                                                                }
                                                                else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] != 'I')
              
                                                                {
                                                                    arg1 = 7;
                                                                    first = 1;
                                                                }
                                                                 else if (ch[1] == 'I' && ch[2] == 'X')
              
                                                                {
                                                                    arg1 = 9;
                                                                    first = 1;
                                                                }
                                                                else if((ch[1] == 'X') && (ch[2] != 'I'))

                                                                {
                                                                    arg1 = 10;
                                                                    first = 1;
                                                                }
                                                                else if(ch[1] == '1' && ch[2] != '0')
              
                                                                {
                                                                    arg1 = 1;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '2')

                                                                {
                                                                    arg1 = 2;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '3')

                                                                            {
                                                                    arg1 = 3;
                                                                    first = 2;
                                                                }
                                                                
                                                                else if (ch[1] == '4')

                                                                            {
                                                                    arg1 = 4;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '5')

                                                                 {
                                                                    arg1 = 5;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '6')

                                                                {
                                                                    arg1 = 6;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '7')

                                                                {
                                                                    arg1 = 7;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '8')

                                                                {
                                                                    arg1 = 8;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '9')

                                                                {
                                                                    arg1 = 9;
                                                                    first = 2;
                                                                }
                                                                else if (ch[1] == '1' && ch[2] == '0')

                                                                            {
                                                                    arg1 = 10;
                                                                    first = 2;
                                                                }
                                                                 else 
                                                                { 
                                                                    System.out.println("Недопустимое значение");
                                                                    nextStep = false;
                                                                }
                                                                 if ((arg1 == 1 | arg1 == 5 | arg1 == 10) && first == 1 ){
                                                                    if (ch[2] == '+') 
                                                                            {operation=0;}
                                                                    else if (ch[2] == '-')
                                                                    {operation=1;}
                                                                    else if (ch[2] == '*')
                                                                    {operation=2;}
                                                                    else if (ch[2] == '/')
                                                                    {operation=3;}
                                                                  else {System.out.println("Недопустимая операция");}}
                                                                if ((arg1 == 2 | arg1 == 4 | arg1 == 6 | arg1 == 9) && first == 1){
                                                                   if (ch[3] == '+') 
                                                                            {operation=0;}
                                                                    else if (ch[3] == '-')
                                                                    {operation=1;}
                                                                    else if (ch[3] == '*')
                                                                    {operation=2;}
                                                                    else if (ch[3] == '/')
                                                                   {operation=3;}
                                                                 else {System.out.println("Недопустимая операция");}}
                                                                
                                                                  if (arg1  == 3 | arg1 == 7 && first == 1){
                                                                  if (ch[4] == '+') 
                                                                           {operation=0;}
                                                                   else if (ch[4] == '-')
                                                                   {operation=1;}
                                                                   else if (ch[4] == '*')
                                                                   {operation=2;}
                                                                   else if (ch[4] == '/')
                                                                   {operation=3;}
                                                                   else {System.out.println("Недопустимая операция");}
                                                                    }
                                                                                                                                                                   
            
                                                                if ((arg1 == 1 | arg1 == 5 | arg1 == 10) && first == 1) {
                                                                if  (ch[3] == 'I' && ch[4] == 'I' && ch[5] == 'I' ) 

                                                                {
                                                                    arg2 = 3;
                                                                    second = 1;
                                                                }
                                                                                                                                
                                                                else if (ch[3] == 'V' && ch[4] == 'I' && ch[5] == 'I' && ch[6] != 'I' ) 

                                                                {
                                                                    arg2 = 7;
                                                                    second = 1;
                                                                }
                                                               
                                                                else if (ch[3] == '1' && ch[4] == '0')

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

                                                               if (ch[4] == 'I' && ch[5] != 'I' && ch[5] != 'V' && ch[5] != 'X' )// определяеи 2число и тип РИМ или АРАБ
                                                                {
                                                                    arg2 = 1;
                                                                    second = 1;
                                                                } else if 
                                                                    (ch[4] == 'I' && ch[5] == 'I' && ch[6] != 'I') 


                                                                {
                                                                    arg2 = 2;
                                                                    second = 1;
                                                                }
                                                                else if (ch[4] == 'I' && ch[5] == 'I' && ch[6] == 'I' && ch[7] == ' ') 


                                                                {
                                                                    arg2 = 3;
                                                                   second = 1;
                                                                }
                                                                else if (ch[4] == 'I' && ch[5] == 'V' && ch[6] == ' ') 

                                                                            {
                                                                    arg2 = 4;
                                                                    second = 1;
                                                                }
                                                                else if (ch[4] == 'V' && ( ch[5] != 'I' | ch[5] == ' ' )) 


                                                                {
                                                                    arg2 = 5;
                                                                    second = 1;
                                                                }
                                                                else  if (ch[4] == 'V' && ch[5] == 'I' && (ch[6] != 'I' | ch[6] == ' ')) 


                                                                {
                                                                    arg2 = 6;
                                                                    second = 1;
                                                                }
                                                                else if (ch[4] == 'V' && ch[5] == 'I' && ch[6] == 'I' && (ch[7] != 'I' | ch[7] == ' ')) 


                                                                {
                                                                    arg2 = 7;
                                                                    second = 1;
                                                                }
                                                                else if (ch[4] == 'V' && ch[5] == 'I' && ch[6] == 'I' && ch[7] != 'I' && ch[8] == ' ') 


                                                                {
                                                                    arg2 = 8;
                                                                    second = 1;
                                                                }
                                                                else if (ch[4] == 'I' && ch[5] == 'X' && ch[6] == ' ') 


                                                                {
                                                                    arg2 = 9;
                                                                    second = 1;
                                                                }
                                                                else if (ch[4] == 'X' && ch[5] == ' ')


                                                                {
                                                                    arg2 = 10;
                                                                    second = 1;
                                                                }
                                                                else if (ch[4] == '1' && (ch[5] != '0' | ch[5] == ' '))


                                                                {
                                                                    arg2 = 1;
                                                                    second = 2;
                                                                }
                                                                else if(ch[4] == '2' && ch[5] == ' ')


                                                                {
                                                                    arg2 = 2;
                                                                    second = 2;
                                                                }
                                                                else if (ch[4] == '3' && ch[5] == ' ')


                                                                {
                                                                    arg2 = 3;
                                                                    second = 2;
                                                                }
                                                                else if (ch[4] == '4' && ch[5] == ' ')


                                                                {
                                                                    arg2 = 4;
                                                                    second = 2;
                                                                }
                                                                else if (ch[4] == '5' && ch[5] == ' ')


                                                                {
                                                                    arg2 = 5;
                                                                    second = 2;
                                                                }
                                                                else if (ch[4] == '6' && ch[5] == ' ')



                                                                {
                                                                    arg2 = 6;
                                                                    second = 2;
                                                                }
                                                                else if (ch[4] == '7' && ch[5] == ' ')


                                                                {
                                                                    arg2 = 7;
                                                                    second = 2;
                                                                }
                                                                else if (ch[4] == '8' && ch[5] == ' ')

                                                                {
                                                                    arg2 = 8;
                                                                    second = 2;
                                                                }
                                                                else if (ch[4] == '9' && ch[5] == ' ')


                                                                {
                                                                    arg2 = 9;
                                                                    second = 2;
                                                                }
                                                                else if (ch[4] == '1' && ch[5] == '0' && ch[6] == ' ')


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


                                                        if (first == 1 && (arg1  == 3 | arg1 ==7)){                                                       
                                                            if (ch[5] == 'I' && ch[6] != 'I' && ch[6] != 'V' && ch[6] != 'X' )// определяеи 2число и тип РИМ или АРАБ
                                                            {
                                                                arg2 = 1;
                                                                second = 1;
                                                            } else if
                                                                    (ch[5] == 'I' && ch[6] == 'I' && ch[7] != 'I' && ch[8] == ' ')

                                                            {
                                                                arg2 = 2;
                                                                second = 1;
                                                            }


                                                            if (ch[5] == 'I' && ch[6] == 'I' && ch[7] == 'I' && ch[8] == ' ')


                                                            {
                                                                arg2 = 3;
                                                                second = 1;
                                                            }
                                                            else if (ch[5] == 'I' && ch[6] == 'V' && ch[7] == ' ')


                                                            {
                                                                arg2 = 5;
                                                                second = 1;
                                                            }
                                                            else if (ch[5] == 'V' && ch[6] != 'I' && ch[7] == ' ')


                                                            {
                                                                arg2 = 5;
                                                                second = 1;
                                                            }
                                                            else if (ch[5] == 'V' && ch[6] == 'I' &&(ch[7] != 'I' | ch[7] == ' '))


                                                            {
                                                                arg2 = 6;
                                                                second = 1;
                                                            }
                                                            
                                                            
                                                            else if (ch[5] == 'I' && ch[6] == 'X' )


                                                            {
                                                                arg2 = 9;
                                                                second = 1;
                                                            }
                                                            else if (ch[5] == 'X' && ch[6] == ' ')

                                                            {
                                                                arg2 = 10;
                                                                second = 1;
                                                            }
                                                            
                                                            else if (ch[5] == '1' && ch[6] == '0' )

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
                                                           break;

                                                 case 6:  
                                                                if (ch[1] == 'I' && ((ch[2] != 'I') | (ch[2] != 'V') | (ch[2] != 'X')))// определяеи 1число и тип РИМ или АРАБ
                                                                {
                                                                    arg1 = 1;
                                                                    first = 1;
                                                                    }
                                                                else if (ch[1] == 'I' && ch[2] == 'I' && ch[3] != 'I')
                                                                {
                                                                arg1 = 2;
                                                                first = 1;
                                                                }
                                                                else if (ch[1] == 'I' && ch[2] == 'I'&& ch[3]== 'I' ) {
                                                           
                                                                arg1 = 3;
                                                                first = 1;
                                                               }
                                                                if (ch[1] == 'I' && ch[2] == 'V') {
                                                                arg1 = 4;
                                                                first = 1;
                                                                 } 
                                                                else if (ch[1] == 'V' && ch[2] != 'I'){

                                                                arg1 = 5;
                                                                first = 1;
                                                               }
                                                               else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] != 'I')

                                                                {
                                                                    arg1 = 6;
                                                                    first = 1;
                                                                }
                                                                else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] != 'I')
              
                                                                {
                                                                    arg1 = 7;
                                                                    first = 1;
                                                                }
                                                                 else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] == 'I')
              
                                                                {
                                                                    arg1 = 8;
                                                                    first = 1;
                                                                }
                                                                 else if (ch[1] == 'I' && ch[2] == 'X')
              
                                                                {
                                                                    arg1 = 9;
                                                                    first = 1;
                                                                }
                                                                else if((ch[1] == 'X') && (ch[2] != 'I'))

                                                                {
                                                                    arg1 = 10;
                                                                    first = 1;
                                                                }
                                                               
                                                                 else 
                                                                { 
                                                                    System.out.println("Недопустимое значение");
                                                                    nextStep = false;
                                                                }
                                                                 if ((arg1 == 1 | arg1 == 5 | arg1 == 10) && first == 1 ){
                                                                    if (ch[2] == '+') 
                                                                            {operation=0;}
                                                                    else if (ch[2] == '-')
                                                                    {operation=1;}
                                                                    else if (ch[2] == '*')
                                                                    {operation=2;}
                                                                    else if (ch[2] == '/')
                                                                    {operation=3;}
                                                                  else {System.out.println("Недопустимая операция");}}
                                                                if ((arg1 == 2 | arg1 == 4 | arg1 == 6 | arg1 == 9) && first == 1){
                                                                   if (ch[3] == '+') 
                                                                            {operation=0;}
                                                                    else if (ch[3] == '-')
                                                                    {operation=1;}
                                                                    else if (ch[3] == '*')
                                                                    {operation=2;}
                                                                    else if (ch[3] == '/')
                                                                   {operation=3;}
                                                                 else {System.out.println("Недопустимая операция");}}
                                                                
                                                                  if ((arg1  == 3 | arg1 == 7) && first == 1){
                                                                  if (ch[4] == '+') 
                                                                           {operation=0;}
                                                                   else if (ch[4] == '-')
                                                                   {operation=1;}
                                                                   else if (ch[4] == '*')
                                                                   {operation=2;}
                                                                   else if (ch[4] == '/')
                                                                   {operation=3;}
                                                                   else {System.out.println("Недопустимая операция");}
                                                                    }
                                                                                                                                                                   
            
                                                                if ((arg1 == 1 | arg1 == 5 | arg1 == 10) && first == 1) {
                                                                                                                             
                                                                if (ch[3] == 'V' && ch[4] == 'I' && ch[5] == 'I' && ch[6] == 'I' ) 

                                                                {
                                                                    arg2 = 8;
                                                                    second = 1;
                                                                }
                                                               
                                                                else 
                                                              { 
                                                                  System.out.println("Недопустимое значение");
                                                                  nextStep = true;
                                                                      }

                                                              }
                                                              if (arg1 == 2  | arg1 == 4 | arg1 == 6 | arg1 == 9 ) {

                                                               if (ch[4] == 'I' && ch[5]== 'I' && ch[6] == 'I' )// определяеи 2число и тип РИМ или АРАБ
                                                                {
                                                                    arg2 = 3;
                                                                    second = 1;
                                                                } else if 
                                                                    (ch[4] == 'V' && ch[5] == 'I' && ch[6] == 'I') 


                                                                {
                                                                    arg2 = 7;
                                                                    second = 1;
                                                                }
                                                               
                                                                else 
                                                              { 
                                                                  System.out.println("Недопустимое значение");
                                                                  nextStep = true;
                                                                      }

                                                            }


                                                        if (first == 1 && (arg1  == 3 | arg1 ==7)){                        // определяеи 2число и тип РИМ или АРАБ                                {
                                                             if
                                                                    (ch[5] == 'I' && ch[6] == 'I' && ch[7] != 'I' && ch[8] == ' ')

                                                            {
                                                                arg2 = 2;
                                                                second = 1;
                                                            }

                                                            else if (ch[5] == 'I' && ch[6] == 'V' )

                                                            {
                                                                arg2 = 4;
                                                                second = 1;
                                                            }
                                                            else if (ch[5] == 'V' && ch[6] == 'I' )

                                                            {
                                                                arg2 = 6;
                                                                second = 1;
                                                            }
                                                            
                                                            else if (ch[5] == 'I' && ch[6] == 'X' )

                                                            {
                                                                arg2 = 9;
                                                                second = 1;
                                                            }
                                                           
                                                            else
                                                            {
                                                                System.out.println("Недопустимое значение");
                                                                nextStep = false;
                                                            }
                                                        }
                                                        
                                                           break;

                                                     case 7:  // определяеи 1число и тип РИМ или АРАБ
                                                                if (ch[1] == 'I' && ch[2] == 'I' && ch[3] != 'I')
                                                                {
                                                                arg1 = 2;
                                                                first = 1;
                                                                }
                                                                else if (ch[1] == 'I' && ch[2] == 'I'&& ch[3]== 'I' ) {
                
                                                                arg1 = 3;
                                                                first = 1;
                                                               }
                                                                else if(ch[1] == 'I' && ch[2] == 'V') {
                                                                arg1 = 4;
                                                                first = 1;
                                                                 } 
                                                                
                                                               else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] != 'I')

                                                                {
                                                                    arg1 = 6;
                                                                    first = 1;
                                                                }
                                                                else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] != 'I')
              
                                                                {
                                                                    arg1 = 7;
                                                                    first = 1;
                                                                }
                                                                 else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] == 'I')
              
                                                                {
                                                                    arg1 = 8;
                                                                    first = 1;
                                                                }
                                                                 else if (ch[1] == 'I' && ch[2] == 'X')
              
                                                                {
                                                                    arg1 = 9;
                                                                    first = 1;
                                                                }
                                                                                                                               
                                                                 else 
                                                                { 
                                                                    System.out.println("Недопустимое значение");
                                                                    nextStep = false;
                                                                }
                                                                
                                                                if ((arg1 == 2 | arg1 == 4 | arg1 == 6 | arg1 == 9) && first == 1){
                                                                   if (ch[3] == '+') 
                                                                            {operation=0;}
                                                                    else if (ch[3] == '-')
                                                                    {operation=1;}
                                                                    else if (ch[3] == '*')
                                                                    {operation=2;}
                                                                    else if (ch[3] == '/')
                                                                   {operation=3;}
                                                                 else {System.out.println("Недопустимая операция");}}
                                                                
                                                                  if ((arg1  == 3 | arg1 == 7) && first == 1){
                                                                  if (ch[4] == '+') 
                                                                           {operation=0;}
                                                                   else if (ch[4] == '-')
                                                                   {operation=1;}
                                                                   else if (ch[4] == '*')
                                                                   {operation=2;}
                                                                   else if (ch[4] == '/')
                                                                   {operation=3;}
                                                                   else {System.out.println("Недопустимая операция");}
                                                                    }
                                                                    if (arg1  == 8 && first == 1){
                                                                  if (ch[5] == '+') 
                                                                           {operation=0;}
                                                                   else if (ch[5] == '-')
                                                                   {operation=1;}
                                                                   else if (ch[5] == '*')
                                                                   {operation=2;}
                                                                   else if (ch[5] == '/')
                                                                   {operation=3;}
                                                                   else {System.out.println("Недопустимая операция");}
                                                                    }
                                
                                                              if (arg1 == 2  | arg1 == 4 | arg1 == 6 | arg1 == 9 ) {

                                                               if (ch[4] == 'V' && ch[5]== 'I' && ch[6] == 'I' && ch[7] == 'I')// определяеи 2число и тип РИМ или АРАБ
                                                                {
                                                                    arg2 = 8;
                                                                    second = 1;
                                                                } 
                                                               
                                                                else 
                                                              { 
                                                                  System.out.println("Недопустимое значение");
                                                                  nextStep = true;
                                                                      }

                                                            }


                                                        if (first == 1 && (arg1  == 3 | arg1 ==7)){                        // определяеи 2число и тип РИМ или АРАБ                                {
                                                             if
                                                                    (ch[5] == 'I' && ch[6] == 'I' && ch[7] != 'I' )

                                                            {
                                                                arg2 = 3;
                                                                second = 1;
                                                            }

                                                            
                                                            else if (ch[5] == 'V' && ch[6] == 'I' && ch[7] == 'I' )

                                                            {
                                                                arg2 = 7;
                                                                second = 1;
                                                            }
                                                           
                                                            else
                                                            {
                                                                System.out.println("Недопустимое значение");
                                                                nextStep = false;
                                                            }
                                                         
                                                               if(ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] == 'I')

                                                            {
                                                                arg1 = 8;
                                                                first = 1;
                                                            }
                                                        }
                
                                                            if (first == 1 && arg1  == 8){                        // определяеи 2число и тип РИМ или АРАБ                                {
                                                            if (ch[6] == 'I' && ch[7] == 'I' )
                                                                {
                                                                arg1 = 2;
                                                                first = 1;
                                                                }
                                                                
                                                                else if(ch[6] == 'I' && ch[7] == 'V') {
                                                                arg1 = 4;
                                                                first = 1;
                                                                 } 
                                                                
                                                               else if (ch[6] == 'V' && ch[7] == 'I')

                                                                {
                                                                    arg1 = 6;
                                                                    first = 1;
                                                                }
                                                                
                                                                
                                                                 else if (ch[6] == 'I' && ch[7] == 'X')
              
                                                                {
                                                                    arg1 = 9;
                                                                    first = 1;
                                                                }
                                                                                                                               
                                                                 else 
                                                                { 
                                                                    System.out.println("Недопустимое значение");
                                                                    nextStep = false;
                                                                }
                                                        }
                                                                break;
                                                    
                                                           case 8:  
                                                                if (ch[1] == 'I' && ch[2] == 'I'&& ch[3]== 'I' ) {          // определяеи 1число и тип РИМ или АРАБ
                
                                                                arg1 = 3;
                                                                first = 1;
                                                               }
                                                                
                                                                else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] != 'I')
              
                                                                {
                                                                    arg1 = 7;
                                                                    first = 1;
                                                                }
                                                                 else if (ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] == 'I')
              
                                                                {
                                                                    arg1 = 8;
                                                                    first = 1;
                                                                }
                                                                                                                          
                                                                 else 
                                                                { 
                                                                    System.out.println("Недопустимое значение");
                                                                    nextStep = false;
                                                                }
                                                                                                              
                                                                  if ((arg1  == 3 | arg1 == 7) && first == 1){
                                                                  if (ch[4] == '+') 
                                                                           {operation=0;}
                                                                   else if (ch[4] == '-')
                                                                   {operation=1;}
                                                                   else if (ch[4] == '*')
                                                                   {operation=2;}
                                                                   else if (ch[4] == '/')
                                                                   {operation=3;}
                                                                   else {System.out.println("Недопустимая операция");}
                                                                   }
                                                           
                                                                    if (arg1  == 8 && first == 1){
                                                                  if (ch[5] == '+') 
                                                                           {operation=0;}
                                                                   else if (ch[5] == '-')
                                                                   {operation=1;}
                                                                   else if (ch[5] == '*')
                                                                   {operation=2;}
                                                                   else if (ch[5] == '/')
                                                                   {operation=3;}
                                                                   else {System.out.println("Недопустимая операция");}
                                                                    }
                                

                                                        if (first == 1 && (arg1  == 3 | arg1 ==7)){                        // определяеи 2число и тип РИМ или АРАБ                                {
                                                              if (ch[5] == 'V' && ch[6] == 'I' && ch[7] == 'I' && ch[8] == 'I')

                                                            {
                                                                arg2 = 8;
                                                                second = 1;
                                                            }
                                                           
                                                            else
                                                            {
                                                                System.out.println("Недопустимое значение");
                                                                nextStep = false;
                                                            }
                                                         
                                                        }
                                                                break;
                                                    
                                                      case 9:  
                                                                if (ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] == 'I')
              
                                                                {
                                                                    arg1 = 8;
                                                                    first = 1;
                                                                }
                                                                                                                                                                                               
                                                                 else 
                                                                { 
                                                                    System.out.println("Недопустимое значение");
                                                                    nextStep = false;
                                                                }
                                                                        
                                                                    if (arg1  == 8 && first == 1){
                                                                  if (ch[5] == '+') 
                                                                           {operation=0;}
                                                                   else if (ch[5] == '-')
                                                                   {operation=1;}
                                                                   else if (ch[5] == '*')
                                                                   {operation=2;}
                                                                   else if (ch[5] == '/')
                                                                   {operation=3;}
                                                                   else {System.out.println("Недопустимая операция");}
                                                                    }
                                
                                                                                                                            
                                                                 if (arg1 == 8 && first == 1) {
                                                                
                                                                if (ch[6] == 'V' && ch[7]== 'I' && ch[8] == 'I' && ch[9] == 'I'  )// определяеи 2число и тип РИМ или АРАБ
                                                                {
                                                                    arg2 = 8;
                                                                    second = 1;
                                                                } 
                                                               
                                                                else 
                                                              { 
                                                                  System.out.println("Недопустимое значение");
                                                                  nextStep = true;
                                                                      }

                                                            }


                                                        if (first == 1 && (arg1  == 3 | arg1 ==7)){                        // определяеи 2число и тип РИМ или АРАБ                                {
                                                             if
                                                                    (ch[5] == 'I' && ch[6] == 'I' && ch[7] != 'I' )

                                                            {
                                                                arg2 = 3;
                                                                second = 1;
                                                            }

                                                            
                                                            else if (ch[5] == 'V' && ch[6] == 'I' && ch[7] == 'I' )

                                                            {
                                                                arg2 = 7;
                                                                second = 1;
                                                            }
                                                           
                                                            else
                                                            {
                                                                System.out.println("Недопустимое значение");
                                                                nextStep = false;
                                                            }
                                                            }
                                                      
                                                        


                                                               if (ch[1] == 'V' && ch[2] == 'I' && ch[3] == 'I' && ch[4] == 'I')

                                                            {
                                                                arg1 = 8;
                                                                first = 1;
                                                            }
                                                            
                                                           
                                                            if (first == 1 && arg1  == 8){                        // определяеи 2число и тип РИМ или АРАБ                                {
                                                            if (ch[6] == 'I' && ch[7] == 'I' )
                                                                {
                                                                arg1 = 2;
                                                                first = 1;
                                                                }
                                                                
                                                                else if(ch[6] == 'I' && ch[7] == 'V') {
                                                                arg1 = 4;
                                                                first = 1;
                                                                 } 
                                                                
                                                               else if (ch[6] == 'V' && ch[7] == 'I')

                                                                {
                                                                    arg1 = 6;
                                                                    first = 1;
                                                                }
                                                                
                                                                
                                                                 else if (ch[6] == 'I' && ch[7] == 'X')
              
                                                                {
                                                                    arg1 = 9;
                                                                    first = 1;
                                                                }
                                                                                                                               
                                                                 else 
                                                                { 
                                                                    System.out.println("Недопустимое значение");
                                                                    nextStep = false;
                                                                }break;
                                                           }
                                                        }
                                                        
                                                        
        /*                                                
        else if (ch[6] == 'V' && ch[7] == 'I' && ch[8] == 'I' && ch[9] == 'I' && ch[10] == ' ') 
            
            
        {
            arg2 = 8;
            second = 1;
        }
        else if (ch[6] == 'I' && ch[7] == 'X' && ch[8] == ' ') 
            
            
        {
            arg2 = 9;
            second = 1;
        }
        else if (ch[6] == 'X' && (ch[7] != 'I' | ch[7] == ' '))
              
        {
            arg2 = 10;
            second = 1;
        }
        else if (ch[6] == '1' && (ch[7] != '0' | ch[7] == ' '))
              
        {
            arg2 = 1;
            second = 2;
        }
        else if (ch[6] == '2' && ch[7] == ' ')
                 
        {
            arg2 = 2;
            second = 2;
        }
        else if (ch[6] == '3' && ch[7] == ' ')
             
        {
            arg2 = 3;
            second = 2;
        }
        else if (ch[6] == '4' && ch[7] == ' ')
                   
        {
            arg2 = 4;
            second = 2;
        }
        else if (ch[6] == '5' && ch[7] == ' ')
                  
        {
            arg2 = 5;
            second = 2;
        }
        else if (ch[6] == '6' && ch[7] == ' ')
              
        {
            arg2 = 6;
            second = 2;
        }
        else if (ch[6] == '7' && ch[7] == ' ')
               
        {
            arg2 = 7;
            second = 2;
        }
        else if (ch[6] == '8' && ch[7] == ' ')
             
        {
            arg2 = 8;
            second = 2;
        }
        else if (ch[6] == '9' && ch[7] == ' ')
               
        {
            arg2 = 9;
            second = 2;
        }
        else if (ch[6] == '1' && ch[7] == '0' && ch[8] == ' ')
               
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
                 if (ch[2] == '+') 
                         {operation=0;}
                 else if (ch[2] == '-')
                 {operation=1;}
                 else if (ch[2] == '*')
                 {operation=2;}
                 else if (ch[2] == '/')
                 {operation=3;}
               else {System.out.println("Недопустимая операция");}}
             if ((arg1 == 2 | arg1 == 4 | arg1 == 6 | arg1 == 9) && first == 1){
                if (ch[3] == '+') 
                         {operation=0;}
                 else if (ch[3] == '-')
                 {operation=1;}
                 else if (ch[3] == '*')
                 {operation=2;}
                 else if (ch[3] == '/')
                {operation=3;}
             else {System.out.println("Недопустимая операция");}
             if (arg1  == 3 | arg1 == 7 && first == 1){
              if (ch[4] == '+') 
                         {operation=0;}
                 else if (ch[4] == '-')
                 {operation=1;}
                 else if (ch[4] == '*')
                 {operation=2;}
                 else if (ch[4] == '/')
                 {operation=3;}
                 else {System.out.println("Недопустимая операция");}
             if (arg1  == 8 && first == 1){
              if (ch[5] == '+') 
                         {operation=0;}
                 else if (ch[5] == '-')
                 {operation=1;}
                 else if (ch[5] == '*')
                 {operation=2;}
                 else if (ch[5] == '/')
                 {operation=3;}}
                else {System.out.println("Недопустимая операция");}
              if ((arg1 == 1 | arg1 == 2 | arg1 == 3 | arg1 == 4 | arg1 == 5 | arg1 == 6 | arg1 == 7 | arg1 == 8 | arg1 == 9) && first == 2 ){
                if (ch[2] == '+') 
                         {operation=0;}
                 else if (ch[2] == '-')
                 {operation=1;}
                 else if (ch[2] == '*')
                 {operation=2;}
                 else if (ch[2] == '/')
                 {operation=3;}}
                else {System.out.println("Недопустимая операция");}
                if (arg1 == 10 && first == 2 ) {
                 if (ch[2] == '+')
                 {operation=0;}
                 else if (ch[2] == '-')
                 {operation=1;}
                 else if (ch[2] == '*')
                 {operation=2;}
                 else if (ch[2] == '/')
                 {operation=3;}}
                else {System.out.println("Недопустимая операция");}
        
               }
}*/
            
            if (first == 2 && second == 2){
            //Operation op;
                  //op = myOpFactory.getOpInstance(operation);
            System.out.println(Math.round(myOpFactory.getOpInstance(operation).exec(arg1, arg2)));// Округляем результат до целого числа для арабских чисел
            }

            else  if (first == 1 && second==1 && ( operation!=1 | operation==1 && arg1>arg2 )){         // Переводим результат в римские числа 
            
        //Operation op;
                   // op = myOpFactory.getOpInstance(operation);
            int operand;
            operand = myOpFactory.getOpInstance(operation).exec(arg1, arg2);
         
            Convert conversion = new Convert();         
            System.out.println(conversion.intToRome(operand));}// else  if (first == 1 && second==1 && operation==1 && arg1>arg2){// Переводим результат в римские числа разность более  0
            //Operation op;
                    //op = myOpFactory.getOpInstance(operation);
              //  Convert convert= new Convert();
               
          //  System.out.println(convert.operand(myOpFactory.getOpInstance(operation).exec(arg1, arg2))));}

            else  if (first == 1 && second==1 && operation==1 && arg1<arg2){// Переводим результат в римские числа разность менее 0
            // Operation op = myOpFactory.getOpInstance(operation);
                int operand;
            operand = myOpFactory.getOpInstance(operation).exec(arg1, arg2);
               Convert conversion = new Convert();    
            System.out.println(" - " + conversion.intToRome(operand));}
            
             else  if (first == 1 && second==1 && operation==1 && arg1==arg2){// Переводим результат в римские числа разность 0
             System.out.println(" НОЛЬ  ");}// ноль у римлян отсутствовал
               
             }
            while (nextStep);
     }

            

   }
       

                                                    