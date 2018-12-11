import java.util.*;

//**************************************************************************//
//Description on Wikipedia -> https://en.wikipedia.org/wiki/RC4#Description//
//**************************************************************************//

public class Main {    
    private static final int key[]; //The message to cipher
    private static int s[] = new int[CONST];
    private static final int CONST; //It's normal to use a 256-byte
    
    public static void main(String[] args) throws Exception {
        
        for(int i=0; i<CONST;i++) {
            s[i] = i;
        }
        
        int j = 0;
        
        for(int i=0; i<CONST;i++) {
            j = (j + s[i] + clave[i % clave.length]) % CONST;
            swap(s,i,j);
        }
        
        int i=0;
        j=0;
        
        int sC[] = new int[CONST];
        
        for(int x=0; x<CONST;x++) {
            i = (i + 1) % CONST;
            j = (j + s[i]) % CONST;
        
            swap(s, i, j);
        
            sC[x] = s[(s[i] + s[j]) % CONST];
        }
        
        int result[] = new int[CONST];
        for(int y=0; y<CONST;y++) {
            result[y] = secuenciaCifrante[y] ^ key[y];
        }
        
    }
    
    public static void swap(int s[], int i, int j) {
        int temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

}
