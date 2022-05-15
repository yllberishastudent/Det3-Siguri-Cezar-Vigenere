
package ceasercipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class c1 extends javax.swing.JFrame {

   
    public c1() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("caesar cipher");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Key :");

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Sentence :");

        t1.setBackground(new java.awt.Color(0, 0, 0));
        t1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));

        t2.setBackground(new java.awt.Color(0, 0, 0));
        t2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(204, 204, 204));
        b1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 0, 51));
        b1.setText("Encode");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 204, 204));
        b2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 51));
        b2.setText("Decode");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        t3.setFont(new java.awt.Font("Lucida Console", 3, 24)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 0, 51));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Result :");

        b3.setBackground(new java.awt.Color(204, 204, 204));
        b3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 0, 51));
        b3.setText("Reset");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(b1)
                        .addGap(188, 188, 188)
                        .addComponent(b2)))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(t3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b3)
                .addGap(339, 339, 339))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(jLabel3)
                    .addContainerGap(651, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(b2))
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(b3)
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(jLabel3)
                    .addContainerGap(349, Short.MAX_VALUE)))
        );

        pack();
    }

	private static final String aplha = "abcdefghijklmnopqrstuvwxyz";
	static char alphabet;
	
    public static String encrypt(String plaintext, int shift) { 
    	String ciphertext = "";
    	for(int i=0; i < plaintext.length();i++) 
    {
        // Shift one character at a time
       alphabet = plaintext.charAt(i);
       
       // if alphabet lies between a and z 
       if(alphabet >= 'a' && alphabet <= 'z') 
       {
        // shift alphabet
        alphabet = (char) (alphabet + shift);
        // if shift alphabet greater than 'z'
        if(alphabet > 'z') {
           // reshift to starting position 
           alphabet = (char) (alphabet+'a'-'z'-1);
        }
        ciphertext = ciphertext + alphabet;
       }
       
       // if alphabet lies between 'A'and 'Z'
       else if(alphabet >= 'A' && alphabet <= 'Z') {
        // shift alphabet
        alphabet = (char) (alphabet + shift);    
           
        // if shift alphabet greater than 'Z'
        if(alphabet > 'Z') {
            //reshift to starting position 
            alphabet = (char) (alphabet+'A'-'Z'-1);
        }
        ciphertext = ciphertext + alphabet;
       }
       else {
        ciphertext = ciphertext + alphabet;   
       }
   
    }
	  
	    return ciphertext;
	    }
    
     public static String decrypt(String ciphertext, int shift) {
        ciphertext = ciphertext.toLowerCase();
        
        String decryptMessage = "";
        for(int i=0; i < ciphertext.length();i++)  

        {
            // Shift one character at a time
            char alphabet = ciphertext.charAt(i);
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alphabet
                alphabet = (char) (alphabet - shift);
            
                // shift alphabet lesser than 'a'
                if(alphabet < 'a') {
                    //reshift to starting position 
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }    
                // if alphabet lies between A and Z
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
             // shift alphabet
                alphabet = (char) (alphabet - shift);
                
                //shift alphabet lesser than 'A'
                if (alphabet < 'A') {
                    // reshift to starting position 
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;            
            }
            else 
            {
             decryptMessage = decryptMessage + alphabet;            
            } 
        }
        return decryptMessage;
      }
    
    
    
    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
            String str = t1.getText();
            String key = t2.getText();
            int k = Integer.parseInt(key);  
            str = str.toLowerCase();
            int rand = (int)Math.random();
            
        String newtext = "";
        
        if(str.startsWith("file:")) {
        	System.out.println("kerkoi file");
        	

    		
    		String[] fstr = str.split(": ", 2);
        	
        	   try {
		            File file = new File(fstr[1]);
		            file.setReadable(true);
		            Scanner myReader = new Scanner(file);
		            while (myReader.hasNextLine()) {
		             String data = myReader.nextLine();
		              
		              str = data; 
		            }
		          
		            myReader.close();
		          } catch (FileNotFoundException e) {
		            System.out.println("File wasn't found!");
		          }	
        	   
        	
        	   newtext = encrypt(str,k);
        	   
        	
        	   
        	   try {
        		   Date date = new Date(97, 1, 23);
        		      double diff = (double) date.getTime() - Math.random();
        		     
        		   
        		   String FileLocation = "C:\\Users\\madY\\Desktop\\files\\encryptedCaesarfile" + String.valueOf(diff) + ".txt";
        	   File myObj = new File(FileLocation);
	            if (myObj.createNewFile()) {
	              System.out.println("File created: " + myObj.getName());
	            
	              FileWriter myWriter = new FileWriter(FileLocation);					     
			      myWriter.write(newtext);
			      myWriter.close();
	              
	            } else {
	              System.out.println("File already exists.");
	             
	            }
	          } catch (IOException e) {
	            System.out.println("An error occurred.");
	            
	          }
        		newtext = "File created at : C:\\Users\\madY\\Desktop\\files\\";  
        		t3.setText(newtext);
              	
        }
        else {
    
        		newtext = encrypt(str,k);  
        		t3.setText(newtext);
        }
	
	
    }

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
          
            String str2 =t1.getText();
            String key=t2.getText();
            int k=Integer.parseInt(key);
            String plainText = "";
            plainText = decrypt(str2,k);
			t3.setText(plainText);
		
			
			
			 if(str2.startsWith("file:")) {
		        	System.out.println("kerkoi file");
		        	

		    		
		    		String[] fstr = str2.split(": ", 2);
		        	
		        	   try {
				            File file = new File(fstr[1]);
				            file.setReadable(true);
				            Scanner myReader = new Scanner(file);
				            while (myReader.hasNextLine()) {
				             String data = myReader.nextLine();
				              
				              str2 = data; 
				            }
				          
				            myReader.close();
				          } catch (FileNotFoundException e) {
				            System.out.println("File wasn't found!");
				          }	
		        	   
		        	
		        	   plainText = decrypt(str2,k);
		        	   
		        	
		        	   
		        	   try {
		        		   Date date = new Date(97, 1, 23);
		        		      double diff = (double) date.getTime() - Math.random();
		        		     
		        		   
		        		   String FileLocation = "C:\\Users\\madY\\Desktop\\files\\decryptedCaesarfile" + String.valueOf(diff) + ".txt";
		        	   File myObj = new File(FileLocation);
			            if (myObj.createNewFile()) {
			              System.out.println("File created: " + myObj.getName());
			            
			              FileWriter myWriter = new FileWriter(FileLocation);					     
					      myWriter.write(plainText);
					      myWriter.close();
			              
			            } else {
			              System.out.println("File already exists.");
			             
			            }
			          } catch (IOException e) {
			            System.out.println("An error occurred.");
			            
			          }
		        		plainText = "File created at : C:\\Users\\madY\\Desktop\\files\\";  
		        		t3.setText(plainText);
		              	
		        }
		        else {
		    
		        		plainText = decrypt(str2,k);  
		        		t3.setText(plainText);
		        }
			
			
			
			
			
			
			
			
    }

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }

    public static void main(String args[]) {
           try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
       
    }

   
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
  
}
