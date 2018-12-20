package luiz.vinicios.projetofinal1.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

import luiz.vinicios.projetofinal1.R;

public class MainActivity extends AppCompatActivity {

    //Drawer
    private Drawer result = null;

    //Toolbar
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CadJudoca.class));
            }
        });

        //Inicio MaterialDrawer

        //Inicio AccountHeader
        //####################### SÓ O CABEÇALHO #######################
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                //download nav
                //https://www.google.com/search?q=nav+header+drawer&rlz=1C1RLNS_pt-BRBR804BR804&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjKwMmUoKnfAhUHDZAKHaJZCksQ_AUIDigB&biw=1366&bih=608#imgrc=zrNwDVP9fD2QfM:
                .withHeaderBackground(R.drawable.header_app)
                .addProfiles(
                        new ProfileDrawerItem().withName("Judoca1").withEmail("Judocateste@gmail.com").withIcon(getResources().getDrawable(R.drawable.header_app))
                        /*new ProfileDrawerItem().withName("Joao Silva").withEmail("joaosilva@gmail.com").withIcon(getResources().getDrawable(R.mipmap.ic_launcher))*/
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener(){
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();

        //Inicio Menu
        result = new DrawerBuilder()
                .withActivity(this)
                .withTranslucentStatusBar(false)
                .withToolbar(toolbar)
                .withAccountHeader(headerResult)
                .withSavedInstance(savedInstanceState)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Perfil").withIdentifier(0).withIcon(GoogleMaterial.Icon.gmd_home),
                        new DividerDrawerItem(),
                        new SectionDrawerItem().withName("Ações"),
                        new SecondaryDrawerItem().withName("Mais informações").withIdentifier(1).withIcon(FontAwesome.Icon.faw_archive),
                        new SecondaryDrawerItem().withName("Competições").withIdentifier(2).withIcon(FontAwesome.Icon.faw_calendar),
                        new SecondaryDrawerItem()
                                .withName("Ranking")
                                .withIcon(GoogleMaterial.Icon.gmd_list)
                                .withSubItems(
                                        new SecondaryDrawerItem().withName("Ranking Masculino").withIdentifier(3),
                                        new SecondaryDrawerItem().withName("Ranking Feminino").withIdentifier(4)
                                )
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        switch ((int)drawerItem.getIdentifier()){
                            case 0:
                                Toast.makeText(getBaseContext(),"Você clicou no menu Perfil",Toast.LENGTH_LONG).show();
                                break;

                            case 1:
                                Toast.makeText(getBaseContext(),"Você clicou no menu Mais informaçoes",Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,Tela1.class));
                                break;

                            case 2:
                                Toast.makeText(getBaseContext(),"Você clicou no menu Competições",Toast.LENGTH_LONG).show();
                                break;
                        }
                        return false;
                    }
                }).build();


    }//fecha oncreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

