String str = "programmer";

for(int i=0;i<str.length();i++){

    boolean alreadyChecked = false;

    for(int k=0;k<i;k++){
        if(str.charAt(i)==str.charAt(k)){
            alreadyChecked = true;
            break;
        }
    }

    if(alreadyChecked)
        continue;

    for(int j=i+1;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
            System.out.println(str.charAt(i));
            break;
        }
    }
}
