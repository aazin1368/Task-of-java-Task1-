public class Sort {
	
	    public static void main(String[] args) {
	        
	        String soliloquy = "To be or not to be, that is the question;"
	                + "Whether 'tis nobler in the mind to suffer"
	                + " the slings and arrows of outrageous fortune,"
	                + " or to take arms against a sea of troubles,"
	                + " and by opposing end them?";
	        
	       
	        String[] words = soliloquy.split("\\s+");

	     
	        for (int i = 0; i < words.length; i++) {
	            words[i] = words[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
	        }

	     
	        bubbleSort(words);

	      
	        for (String word : words) {
	            System.out.println(word);
	        }
	    }

	    
	    public static void bubbleSort(String[] arr) {
	        int n = arr.length;
	        boolean swapped;
	        do {
	            swapped = false;
	            for (int i = 1; i < n; i++) {
	                if (arr[i - 1].compareTo(arr[i]) > 0) {
	                    // Swap arr[i-1] and arr[i]
	                    String temp = arr[i - 1];
	                    arr[i - 1] = arr[i];
	                    arr[i] = temp;
	                    swapped = true;
	                }
	            }
	        } while (swapped);
	    }
	}

