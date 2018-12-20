package luiz.vinicios.projetofinal1.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import luiz.vinicios.projetofinal1.R;

public class CadJudoca extends AppCompatActivity {

    private EditText etNome;
    private EditText etUltimoNome;
    private EditText etGraduacao;
    private RadioGroup rgSexo;
    private RadioButton rbMasculino;
    private RadioButton rbFeminino;
    private EditText etPeso;
    private EditText etCelular;
    private EditText etNascimento;
    private Button btCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_judoca);
        init();



    }//fecha oncreate




    private void init(){

        etNome = findViewById(R.id.cd_et_name);
        etUltimoNome = findViewById(R.id.cd_et_last_name);
        etGraduacao = findViewById(R.id.cd_et_graduation);
        rgSexo = findViewById(R.id.cd_rg_sexo);
        rbMasculino = findViewById(R.id.cd_rb_masculino);
        rbFeminino = findViewById(R.id.cd_rb_feminino);
        etPeso = findViewById(R.id.cd_et_weight);
        etCelular = findViewById(R.id.cd_et_cellphone);
        etNascimento = findViewById(R.id.cd_et_born_date);
        btCadastrar = findViewById(R.id.cd_bt_cadastrar);
    }//fecha init
}//fecha class

