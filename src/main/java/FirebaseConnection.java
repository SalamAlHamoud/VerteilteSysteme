package hello;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.recomm.mavenrec.Entity.Book;
import com.recomm.mavenrec.Entity.Hospital;
import java.io.FileInputStream;
import java.io.FileNotFoun## Heading ##dException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FirebaseConnection {
    
    
    
     public void initiainzeSDK() {
        FileInputStream serviceAccount;
        try {
            serviceAccount = new FileInputStream("import.json");
            FirebaseOptions options = new FirebaseOptions.Builder()                        .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
                .setDatabaseUrl("https://salam-c046f.firebaseio.com/")
                .build();

            FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException foe) {
            System.out.println(foe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void authrnticate() {
        DatabaseReference ref = FirebaseDatabase
            .getInstance()
            .getReference("restricted_access/secret_document");
    ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
               Object document = dataSnapshot.getValue();
               System.out.println(document);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public void writeTOFb() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("rec");
        System.out.println(ref);
        DatabaseReference usersRef = ref.child(Nr++);
        System.out.println(usersRef);
        Map<String, Meldung> users = new HashMap<>();
        users.put("abc", new Meldung(4,"abc",true,20,59, 160));
        users.put("xx", new Meldung(5,"xx",true,25,69, 167));
        System.out.println(users);
        usersRef.setValue(users);

    }
    
}
