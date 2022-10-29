function arrange(arr, n){
    let temp = new Array(n);
    
    //index
    //i for smallest element
    //j for largest element
    let i = 0, j = n - 1;
 
    // To indicate whether we need to copy remaining
    // largest or remaining smallest at next position
    let flag = true;
 
    for (let k = 0; k < n; k++) {
        if (flag)
            temp[k] = arr[j--];
        else
            temp[k] = arr[i++];
 
        flag = !flag;
    }
    for (let k = 0; k < n; k++){
        arr[k] = temp[k];
    }
}

    let n = prompt("Please Enter the size of array: ");
    let arr = []
    for(var i=0; i<n; i++) 
    {
        arr[i] = prompt("Enter the element: " + (i+1));
    }
 
    console.log("Original Array:");
    for (let i = 0; i < n; i++){
        console.log(arr[i] + " ");
    }
 
    arrange(arr, n);
    console.log("\n")
 
    console.log("Modified Array:");
    for (let i = 0; i < n; i++){
        console.log(arr[i] + " ");
    }

