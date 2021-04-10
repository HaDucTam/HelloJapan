package com.a1_1801040187;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ScrollView a, b;
    Button e,f;
    TextView c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (ScrollView) findViewById(R.id.scrollview1);
        b = (ScrollView) findViewById(R.id.scrollview2);
        c = (TextView) findViewById(R.id.katakana);
        d = (TextView) findViewById(R.id.hiragana);
        e = (Button) findViewById(R.id.hiraganabutton);
        f = (Button) findViewById(R.id.katakanabutton);


        MediaPlayer A = MediaPlayer.create(this, R.raw.a);
        Button A1 = (Button) this.findViewById(R.id.A);
        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A.start();
            }
        });
        MediaPlayer I = MediaPlayer.create(this, R.raw.i);
        Button I1 = (Button) this.findViewById(R.id.I);
        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I.start();
            }
        });
        MediaPlayer U = MediaPlayer.create(this, R.raw.u);
        Button U1 = (Button) this.findViewById(R.id.U);
        U1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                U.start();
            }
        });
        MediaPlayer E = MediaPlayer.create(this, R.raw.e);
        Button E1 = (Button) this.findViewById(R.id.E);
        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E.start();
            }
        });
        MediaPlayer O = MediaPlayer.create(this, R.raw.o);
        Button O1 = (Button) this.findViewById(R.id.O);
        O1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                O.start();
            }
        });
        MediaPlayer KA = MediaPlayer.create(this, R.raw.ka);
        Button KA1 = (Button) this.findViewById(R.id.KA);
        KA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KA.start();
            }
        });
        MediaPlayer KI = MediaPlayer.create(this, R.raw.ki);
        Button KI1 = (Button) this.findViewById(R.id.KI);
        KI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KI.start();
            }
        });
        MediaPlayer KU = MediaPlayer.create(this, R.raw.ku);
        Button KU1 = (Button) this.findViewById(R.id.KU);
        KU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KU.start();
            }
        });
        MediaPlayer KE = MediaPlayer.create(this, R.raw.ke);
        Button KE1 = (Button) this.findViewById(R.id.KE);
        KE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KE.start();
            }
        });
        MediaPlayer KO = MediaPlayer.create(this, R.raw.ko);
        Button KO1 = (Button) this.findViewById(R.id.KO);
        KO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KO.start();
            }
        });
        MediaPlayer SA = MediaPlayer.create(this, R.raw.sa);
        Button SA1 = (Button) this.findViewById(R.id.SA);
        SA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SA.start();
            }
        });
        MediaPlayer SHI = MediaPlayer.create(this, R.raw.shi);
        Button SHI1 = (Button) this.findViewById(R.id.SHI);
        SHI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHI.start();
            }
        });
        MediaPlayer SU = MediaPlayer.create(this, R.raw.su);
        Button SU1 = (Button) this.findViewById(R.id.SU);
        SU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SU.start();
            }
        });
        MediaPlayer SE = MediaPlayer.create(this, R.raw.se);
        Button SE1 = (Button) this.findViewById(R.id.SE);
        SE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SE.start();
            }
        });
        MediaPlayer SO = MediaPlayer.create(this, R.raw.so);
        Button SO1 = (Button) this.findViewById(R.id.SO);
        SO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SO.start();
            }
        });
        MediaPlayer TA = MediaPlayer.create(this, R.raw.ta);
        Button TA1 = (Button) this.findViewById(R.id.TA);
        TA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TA.start();
            }
        });
        MediaPlayer CHI = MediaPlayer.create(this, R.raw.chi);
        Button CHI1 = (Button) this.findViewById(R.id.CHI);
        CHI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CHI.start();
            }
        });
        MediaPlayer TSU = MediaPlayer.create(this, R.raw.tsu);
        Button TSU1 = (Button) this.findViewById(R.id.TSU);
        TSU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSU.start();
            }
        });
        MediaPlayer TE = MediaPlayer.create(this, R.raw.te);
        Button TE1 = (Button) this.findViewById(R.id.TE);
        TE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TE.start();
            }
        });
        MediaPlayer TO = MediaPlayer.create(this, R.raw.to);
        Button TO1 = (Button) this.findViewById(R.id.TO);
        TO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TO.start();
            }
        });
        MediaPlayer NA = MediaPlayer.create(this, R.raw.na);
        Button NA1 = (Button) this.findViewById(R.id.NA);
        NA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NA.start();
            }
        });
        MediaPlayer NI = MediaPlayer.create(this, R.raw.ni);
        Button NI1 = (Button) this.findViewById(R.id.NI);
        NI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NI.start();
            }
        });
        MediaPlayer NU = MediaPlayer.create(this, R.raw.nu);
        Button NU1 = (Button) this.findViewById(R.id.NU);
        NU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NU.start();
            }
        });
        MediaPlayer NE = MediaPlayer.create(this, R.raw.ne);
        Button NE1 = (Button) this.findViewById(R.id.NE);
        NE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NE.start();
            }
        });
        MediaPlayer NO = MediaPlayer.create(this, R.raw.no);
        Button NO1 = (Button) this.findViewById(R.id.NO);
        NO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NO.start();
            }
        });
        MediaPlayer HA = MediaPlayer.create(this, R.raw.ha);
        Button HA1 = (Button) this.findViewById(R.id.HA);
        HA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HA.start();
            }
        });
        MediaPlayer HI = MediaPlayer.create(this, R.raw.hi);
        Button HI1 = (Button) this.findViewById(R.id.HI);
        HI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HI.start();
            }
        });
        MediaPlayer FU = MediaPlayer.create(this, R.raw.fu);
        Button FU1 = (Button) this.findViewById(R.id.FU);
        FU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FU.start();
            }
        });
        MediaPlayer HE = MediaPlayer.create(this, R.raw.he);
        Button HE1 = (Button) this.findViewById(R.id.HE);
        HE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HE.start();
            }
        });
        MediaPlayer HO = MediaPlayer.create(this, R.raw.ho);
        Button HO1 = (Button) this.findViewById(R.id.HO);
        HO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HO.start();
            }
        });
        MediaPlayer MA = MediaPlayer.create(this, R.raw.ma);
        Button MA1 = (Button) this.findViewById(R.id.MA);
        MA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MA.start();
            }
        });
        MediaPlayer MI = MediaPlayer.create(this, R.raw.mi);
        Button MI1 = (Button) this.findViewById(R.id.MI);
        MI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MI.start();
            }
        });
        MediaPlayer MU = MediaPlayer.create(this, R.raw.mu);
        Button MU1 = (Button) this.findViewById(R.id.MU);
        MU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MU.start();
            }
        });
        MediaPlayer ME = MediaPlayer.create(this, R.raw.me);
        Button ME1 = (Button) this.findViewById(R.id.ME);
        ME1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ME.start();
            }
        });
        MediaPlayer MO = MediaPlayer.create(this, R.raw.mo);
        Button MO1 = (Button) this.findViewById(R.id.MO);
        MO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MO.start();
            }
        });
        MediaPlayer YA = MediaPlayer.create(this, R.raw.ya);
        Button YA1 = (Button) this.findViewById(R.id.YA);
        YA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YA.start();
            }
        });
        MediaPlayer YU = MediaPlayer.create(this, R.raw.yu);
        Button YU1 = (Button) this.findViewById(R.id.YU);
        YU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YU.start();
            }
        });
        MediaPlayer YO = MediaPlayer.create(this, R.raw.yo);
        Button YO1 = (Button) this.findViewById(R.id.YO);
        YO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YO.start();
            }
        });
        MediaPlayer RA = MediaPlayer.create(this, R.raw.ra);
        Button RA1 = (Button) this.findViewById(R.id.RA);
        RA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RA.start();
            }
        });
        MediaPlayer RI = MediaPlayer.create(this, R.raw.ri);
        Button RI1 = (Button) this.findViewById(R.id.RI);
        RI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RI.start();
            }
        });
        MediaPlayer RU = MediaPlayer.create(this, R.raw.ru);
        Button RU1 = (Button) this.findViewById(R.id.RU);
        RU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RU.start();
            }
        });
        MediaPlayer RE = MediaPlayer.create(this, R.raw.re);
        Button RE1 = (Button) this.findViewById(R.id.RE);
        RE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RE.start();
            }
        });
        MediaPlayer RO = MediaPlayer.create(this, R.raw.ro);
        Button RO1 = (Button) this.findViewById(R.id.RO);
        RO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RO.start();
            }
        });
        MediaPlayer WA = MediaPlayer.create(this, R.raw.wa);
        Button WA1 = (Button) this.findViewById(R.id.WA);
        WA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WA.start();
            }
        });
        MediaPlayer WO = MediaPlayer.create(this, R.raw.wo);
        Button WO1 = (Button) this.findViewById(R.id.WO);
        WO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WO.start();
            }
        });
        MediaPlayer N = MediaPlayer.create(this, R.raw.n);
        Button N1 = (Button) this.findViewById(R.id.N);
        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                N.start();
            }
        });


        Button a1 = (Button) this.findViewById(R.id.a);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A.start();
            }
        });

        Button i1 = (Button) this.findViewById(R.id.i);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I.start();
            }
        });

        Button u1 = (Button) this.findViewById(R.id.u);
        u1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                U.start();
            }
        });

        Button e1 = (Button) this.findViewById(R.id.e);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E.start();
            }
        });

        Button o1 = (Button) this.findViewById(R.id.o);
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                O.start();
            }
        });

        Button ka1 = (Button) this.findViewById(R.id.ka);
        ka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KA.start();
            }
        });

        Button ki1 = (Button) this.findViewById(R.id.ki);
        ki1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KI.start();
            }
        });

        Button ku1 = (Button) this.findViewById(R.id.ku);
        ku1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KU.start();
            }
        });

        Button ke1 = (Button) this.findViewById(R.id.ke);
        ke1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KE.start();
            }
        });

        Button ko1 = (Button) this.findViewById(R.id.ko);
        ko1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KO.start();
            }
        });

        Button sa1 = (Button) this.findViewById(R.id.sa);
        sa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SA.start();
            }
        });

        Button shi1 = (Button) this.findViewById(R.id.shi);
        shi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SHI.start();
            }
        });

        Button su1 = (Button) this.findViewById(R.id.su);
        su1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SU.start();
            }
        });

        Button se1 = (Button) this.findViewById(R.id.se);
        se1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SE.start();
            }
        });

        Button so1 = (Button) this.findViewById(R.id.so);
        so1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SO.start();
            }
        });

        Button ta1 = (Button) this.findViewById(R.id.ta);
        ta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TA.start();
            }
        });

        Button chi1 = (Button) this.findViewById(R.id.chi);
        chi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CHI.start();
            }
        });

        Button tsu1 = (Button) this.findViewById(R.id.tsu);
        tsu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSU.start();
            }
        });

        Button te1 = (Button) this.findViewById(R.id.te);
        te1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TE.start();
            }
        });

        Button to1 = (Button) this.findViewById(R.id.to);
        to1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TO.start();
            }
        });

        Button na1 = (Button) this.findViewById(R.id.na);
        na1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NA.start();
            }
        });

        Button ni1 = (Button) this.findViewById(R.id.ni);
        ni1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NI.start();
            }
        });

        Button nu1 = (Button) this.findViewById(R.id.nu);
        nu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NU.start();
            }
        });

        Button ne1 = (Button) this.findViewById(R.id.ne);
        ne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NE.start();
            }
        });

        Button no1 = (Button) this.findViewById(R.id.no);
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NO.start();
            }
        });

        Button ha1 = (Button) this.findViewById(R.id.ha);
        ha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HA.start();
            }
        });

        Button hi1 = (Button) this.findViewById(R.id.hi);
        hi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HI.start();
            }
        });

        Button fu1 = (Button) this.findViewById(R.id.fu);
        fu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FU.start();
            }
        });

        Button he1 = (Button) this.findViewById(R.id.he);
        to1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HE.start();
            }
        });

        Button ho1 = (Button) this.findViewById(R.id.ho);
        ho1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HO.start();
            }
        });

        Button ma1 = (Button) this.findViewById(R.id.ma);
        ma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MA.start();
            }
        });

        Button mi1 = (Button) this.findViewById(R.id.mi);
        mi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MI.start();
            }
        });

        Button mu1 = (Button) this.findViewById(R.id.mu);
        mu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MU.start();
            }
        });

        Button me1 = (Button) this.findViewById(R.id.me);
        me1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ME.start();
            }
        });

        Button mo1 = (Button) this.findViewById(R.id.mo);
        mo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MO.start();
            }
        });

        Button ya1 = (Button) this.findViewById(R.id.ya);
        ya1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YA.start();
            }
        });

        Button yu1 = (Button) this.findViewById(R.id.yu);
        yu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YU.start();
            }
        });

        Button yo1 = (Button) this.findViewById(R.id.yo);
        yo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YO.start();
            }
        });

        Button ra1 = (Button) this.findViewById(R.id.ra);
        ra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RA.start();
            }
        });

        Button ri1 = (Button) this.findViewById(R.id.ri);
        ri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RI.start();
            }
        });

        Button ru1 = (Button) this.findViewById(R.id.ru);
        ru1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RU.start();
            }
        });

        Button re1 = (Button) this.findViewById(R.id.re);
        re1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RE.start();
            }
        });

        Button ro1 = (Button) this.findViewById(R.id.ro);
        ro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RO.start();
            }
        });

        Button wa1 = (Button) this.findViewById(R.id.wa);
        wa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WA.start();
            }
        });

        Button wo1 = (Button) this.findViewById(R.id.wo);
        wo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WO.start();
            }
        });
        Button n1 = (Button) this.findViewById(R.id.n);
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                N.start();
            }
        });
    }

    public void bt1(View view) {
        b.setVisibility(View.VISIBLE);
        a.setVisibility(View.INVISIBLE);
        c.setVisibility(View.VISIBLE);
        d.setVisibility(View.INVISIBLE);
        e.setVisibility(View.VISIBLE);
        f.setVisibility(View.VISIBLE);

    }

    public void bt2(View view) {
        b.setVisibility(View.INVISIBLE);
        a.setVisibility(View.VISIBLE);
        c.setVisibility(View.INVISIBLE);
        d.setVisibility(View.VISIBLE);
        e.setVisibility(View.VISIBLE);
        f.setVisibility(View.VISIBLE);
    }

}