package digi.coders.recyclerviewlistcolor;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerview=findViewById(R.id.recyclerview);
        List<UserModel> userModels=new ArrayList<>();
        userModels.add(new UserModel("Coding Fatehpur",R.drawable.ic_launcher_background));
        userModels.add(new UserModel("Coding Fatehpur",R.drawable.ic_launcher_background));
        userModels.add(new UserModel("Coding Fatehpur",R.drawable.ic_launcher_background));
        userModels.add(new UserModel("Coding Fatehpur",R.drawable.ic_launcher_background));
        userModels.add(new UserModel("Coding Fatehpur",R.drawable.ic_launcher_background));
        userModels.add(new UserModel("Coding Fatehpur",R.drawable.ic_launcher_background));
        UserAdapter userAdapter=new UserAdapter(userModels,MainActivity.this);
        recyclerview.setAdapter(userAdapter);
        recyclerview.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
    }
}