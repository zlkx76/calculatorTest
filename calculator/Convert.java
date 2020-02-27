

package calculator;

class Convert {
    static boolean operation;
	

public String intToRome(int operation){
	String result="";
	while (operation>0){                // 100 есть максимальное из возможных чисел по условиям задания
		if ((operation/100)>=1){
			result=result+"C";
			operation=operation-100;
		}
		else if ((operation/50)>=1){
			result=result+"L";
			operation=operation-50;
		}
		else if ((operation/10)>=1){
			result=result+"X";
			operation=operation-10;
		}
		else if ((operation/1)>=1){
			switch ((operation/1)) {
			case 9:
				result=result+"IX";
				operation=operation-9;
				break;
			case 8:
				result=result+"VIII";
				operation=operation-8;
				break;
			case 7:
				result=result+"VII";
				operation=operation-7;
				break;
			case 6:
				result=result+"VI";
				operation=operation-6;
				break;
			case 5:
				result=result+"V";
				operation=operation-5;
				break;
			case 4:
				result=result+"IV";
				operation=operation-4;
				break;
			case 3:
				result=result+"III";
				operation=operation-3;
				break;
			case 2:
				result=result+"II";
				operation=operation-2;
				break;
			case 1:
				result=result+"I";
				operation=operation-1;
				break;
			}
		}
	}
	return result;
}

}