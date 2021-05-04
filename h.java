

Stack<String> st = new Stack<>();
for(int i =0; i<str.length(); i++) {
  char ch = str.charAt(i);

  if(ch == "){
    st.push("");

  
}



Stack<Character> st = new Stack<>();
        
if(s.length() == 1){
   return false;
}
else{
   
for(int i =0; i<s.length();i++) {
   
   
   char ch = s.charAt(i);
  if(st.empty()){
      st.push(ch);
  }
  else if(ch == '(') {
       st.push(ch);
   }
   else if(ch == ')'){
       if (st.peek() == '(') {
           st.pop();
       }
       else{
         return false;
       }

       if(st.empty()){
         return true;
       }
       else{
         return false;
       }