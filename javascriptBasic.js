
function sort(arr){
    let temp=0;
    for(let i=1;i<arr.length;i++){
        if(arr[i-1]>arr[i]){
            arr[i-1]=arr[i];
            arr[i-1]=temp;
            arr[i]=temp
        }
    }
    console.log(arr);
    
    
}

sort([4,3,4,5,3])