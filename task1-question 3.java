      int spaces = 0,
            vowels = 0,
        	consonants = 0;
        
      
        
        // for-loop
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
          
            if (ch == ' ') {
                spaces++;
            }
           
            else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
      
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }



