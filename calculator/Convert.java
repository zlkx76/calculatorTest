

package calculator;

class Convert {

    
    int operand;
    //static boolean operation;

    
public String intToRome(int operand){
	String result="";
                operand = Math.abs(operand);
	while (operand>0){                // 100 есть максимальное из возможных чисел по условиям задания
		if ((operand/100)>=1){
			result=result+"C";
			operand=operand-100;
		}
		if ((operand/50)>=1){
			result=result+"L";
			operand=operand-50;
		}
		if ((operand/10)>=1){
			result=result+"X";
			operand=operand-10;
		}
		if ((operand/1)>=1){
			switch ((operand/1)) {
			case 9:
				result=result+"IX";
				//operand=operand-9;
				break;
			case 8:
				result=result+"VIII";
				//operand=operand-8;
				break;
			case 7:
				result=result+"VII";
				//operand=operand-7;
				break;
			case 6:
				result=result+"VI";
				//operand=operand-6;
				break;
			case 5:
				result=result+"V";
				//operand=operand-5;
				break;
			case 4:
				result=result+"IV";
				//operand=operand-4;
				break;
			case 3:
				result=result+"III";
				//operand=operand-3;
				break;
			case 2:
				result=result+"II";
				//operand=operand-2;
				break;
			case 1:
				result=result+"I";
				//operand=operand-1;
				break;
			}
		}
	}
	return result;
}

  

    

   

}