class Test {
    public static Integer validate(Integer num) {
        /*
            Write code block so that it get the single digit sum
            ie, until sum a number till, it make to single digit.
            ex: if num=4712==> 4+7+1+2=14==> 1+ 4=5

        */
while(num>=10){
int sum=0;
while (num>0){
sum +=num % 10;
num /= 10;
}
num=sum;
}
return num;
}

     }    
    
