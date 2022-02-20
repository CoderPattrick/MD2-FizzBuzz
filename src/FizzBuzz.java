public class FizzBuzz {
    public String array[]={"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
    String method(int numb){
        if(numb%3==0){
            if(numb%5==0){
                return "FizzBuzz";
            }
            return "Fizz";
        }
        else if(numb%5==0){
            return "Buzz";
        }
        return checkFizzBuzz(numb);
    }
    private String checkFizzBuzz(int numb){
        if(numb<10){
            return array[numb];
        }
        else {
            int tens = numb/10;
            int unit = numb-tens*10;
            if(tens==3||unit==3){
                if(tens==5||unit==5){
                    return "FizzBuzz";
                }
                else {
                    return "Fizz";
                }
            }
            else if(tens==5||unit==5){
                return "Buzz";
            }else {
                return array[tens]+" "+array[unit];
            }
        }
    }
}
