
Map<Integer,Integer> arrmap= new HashMap<>();
for(){
if(arrmap.containsKey(arr[i])){
arrmap.put(arr[i],arrmap.get(arr[i])+1);
}else
arrmap.put(arr[i],1);
}
arrmap.forEach((k,v)->{
	if(v>1){
	sys(k);	
}
}