package edu.stanford.cs193a.ceb_test_app_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //rmakes full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        loginBtn=(Button) findViewById(R.id.loginBtn);


        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                loginBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //if() set comparing username passwrd here then else show error messages
                        Toast.makeText(MainActivity.this,"login Button Pressed",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(v.getContext(), CEB01Activity.class);
                        v.getContext().startActivity(intent);

                    }
                });
            }
        });
//        ds d=new ds();
//        d.execute(this);

    }
//    public class ds extends AsyncTask<Context, Integer, String>{
//        @Override
//        protected String doInBackground(Context... contexts) {
//            return "ok";
//        }
//    }
}
