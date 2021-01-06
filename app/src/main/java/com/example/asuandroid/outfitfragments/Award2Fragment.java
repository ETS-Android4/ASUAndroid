package com.example.asuandroid.outfitfragments;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.ArraySet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.asuandroid.R;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter10;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter11;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter12;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter13;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter14;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter15;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter16;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter17;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter18;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter19;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter21;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter22;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter23;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter24;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter25;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter26;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter27;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter28;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter29;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter3;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter30;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter31;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter32;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter33;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter34;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter35;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter36;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter37;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter38;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter39;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter4;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter40;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter41;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter42;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter43;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter44;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter45;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter46;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter47;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter48;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter49;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter5;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter50;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter6;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter7;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter8;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter9;
import com.example.asuandroid.vectorItems.RibbonItem;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter1;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter2;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter20;


import java.util.ArrayList;

public class Award2Fragment extends Fragment implements PopupMenu.OnMenuItemClickListener {
    public static ArrayList<Integer> fromAward = AwardFragment.finalExport;
    private ArrayList<RibbonItem> mRibbonList;
    private RecyclerView mRecyclerView;
    private RibbonAdapter1 mRecyclerViewAdapter1;
    private RibbonAdapter2 mRecyclerViewAdapter2;
    private RibbonAdapter3 mRecyclerViewAdapter3;
    private RibbonAdapter4 mRecyclerViewAdapter4;
    private RibbonAdapter5 mRecyclerViewAdapter5;
    private RibbonAdapter6 mRecyclerViewAdapter6;
    private RibbonAdapter7 mRecyclerViewAdapter7;
    private RibbonAdapter8 mRecyclerViewAdapter8;
    private RibbonAdapter9 mRecyclerViewAdapter9;
    private RibbonAdapter10 mRecyclerViewAdapter10;
    private RibbonAdapter11 mRecyclerViewAdapter11;
    private RibbonAdapter12 mRecyclerViewAdapter12;
    private RibbonAdapter13 mRecyclerViewAdapter13;
    private RibbonAdapter14 mRecyclerViewAdapter14;
    private RibbonAdapter15 mRecyclerViewAdapter15;
    private RibbonAdapter16 mRecyclerViewAdapter16;
    private RibbonAdapter17 mRecyclerViewAdapter17;
    private RibbonAdapter18 mRecyclerViewAdapter18;
    private RibbonAdapter19 mRecyclerViewAdapter19;
    private RibbonAdapter20 mRecyclerViewAdapter20;
    private RibbonAdapter21 mRecyclerViewAdapter21;
    private RibbonAdapter22 mRecyclerViewAdapter22;
    private RibbonAdapter23 mRecyclerViewAdapter23;
    private RibbonAdapter24 mRecyclerViewAdapter24;
    private RibbonAdapter25 mRecyclerViewAdapter25;
    private RibbonAdapter26 mRecyclerViewAdapter26;
    private RibbonAdapter27 mRecyclerViewAdapter27;
    private RibbonAdapter28 mRecyclerViewAdapter28;
    private RibbonAdapter29 mRecyclerViewAdapter29;
    private RibbonAdapter30 mRecyclerViewAdapter30;
    private RibbonAdapter31 mRecyclerViewAdapter31;
    private RibbonAdapter32 mRecyclerViewAdapter32;
    private RibbonAdapter33 mRecyclerViewAdapter33;
    private RibbonAdapter34 mRecyclerViewAdapter34;
    private RibbonAdapter35 mRecyclerViewAdapter35;
    private RibbonAdapter36 mRecyclerViewAdapter36;
    private RibbonAdapter37 mRecyclerViewAdapter37;
    private RibbonAdapter38 mRecyclerViewAdapter38;
    private RibbonAdapter39 mRecyclerViewAdapter39;
    private RibbonAdapter40 mRecyclerViewAdapter40;
    private RibbonAdapter41 mRecyclerViewAdapter41;
    private RibbonAdapter42 mRecyclerViewAdapter42;
    private RibbonAdapter43 mRecyclerViewAdapter43;
    private RibbonAdapter44 mRecyclerViewAdapter44;
    private RibbonAdapter45 mRecyclerViewAdapter45;
    private RibbonAdapter46 mRecyclerViewAdapter46;
    private RibbonAdapter47 mRecyclerViewAdapter47;
    private RibbonAdapter48 mRecyclerViewAdapter48;
    private RibbonAdapter49 mRecyclerViewAdapter49;
    private RibbonAdapter50 mRecyclerViewAdapter50;
    public static ArrayList<Drawable> bitmapDrawableArray = new ArrayList<Drawable>();
    RecyclerView.RecycledViewPool sharedPool = new RecyclerView.RecycledViewPool();
    public static Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        assert container != null;
        System.out.println(fromAward);
        fromAward.trimToSize();
        System.out.println(fromAward);
        int tots = fromAward.size();
        context = container.getContext();
        createRibbonList();
        //View v = inflater.inflate(R.id.oak);
        final View view = inflater.inflate(R.layout.fragment_award2, container, false);
        final FragmentActivity c = getActivity();
        switch(tots) {
            case 1:
                RibbonAdapter1 mAdapter1 = new RibbonAdapter1(mRibbonList);
                mRecyclerViewAdapter1 = new RibbonAdapter1(mRibbonList);
                final RecyclerView recyclerView1 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager1 = new LinearLayoutManager(c);
                recyclerView1.setLayoutManager(layoutManager1);
                recyclerView1.setAdapter(mAdapter1);
                break;

            case 2:
                RibbonAdapter2 mAdapter2 = new RibbonAdapter2(mRibbonList);
                mRecyclerViewAdapter2 = new RibbonAdapter2(mRibbonList);
                final RecyclerView recyclerView2 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager2 = new LinearLayoutManager(c);
                recyclerView2.setLayoutManager(layoutManager2);
                recyclerView2.setAdapter(mAdapter2);
                break;

            case 3:
                RibbonAdapter3 mAdapter3 = new RibbonAdapter3(mRibbonList);
                mRecyclerViewAdapter3 = new RibbonAdapter3(mRibbonList);
                final RecyclerView recyclerView3 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager3 = new LinearLayoutManager(c);
                recyclerView3.setLayoutManager(layoutManager3);
                recyclerView3.setAdapter(mAdapter3);
                break;

            case 4:
                RibbonAdapter4 mAdapter4 = new RibbonAdapter4(mRibbonList);
                mRecyclerViewAdapter4 = new RibbonAdapter4(mRibbonList);
                final RecyclerView recyclerView4 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager4 = new LinearLayoutManager(c);
                recyclerView4.setLayoutManager(layoutManager4);
                recyclerView4.setAdapter(mAdapter4);
                break;

            case 5:
                RibbonAdapter5 mAdapter5 = new RibbonAdapter5(mRibbonList);
                mRecyclerViewAdapter5 = new RibbonAdapter5(mRibbonList);
                final RecyclerView recyclerView5 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager5 = new LinearLayoutManager(c);
                recyclerView5.setLayoutManager(layoutManager5);
                recyclerView5.setAdapter(mAdapter5);
                break;

            case 6:
                RibbonAdapter6 mAdapter6 = new RibbonAdapter6(mRibbonList);
                mRecyclerViewAdapter6 = new RibbonAdapter6(mRibbonList);
                final RecyclerView recyclerView6 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager6 = new LinearLayoutManager(c);
                recyclerView6.setLayoutManager(layoutManager6);
                recyclerView6.setAdapter(mAdapter6);
                break;

            case 7:
                RibbonAdapter7 mAdapter7 = new RibbonAdapter7(mRibbonList);
                mRecyclerViewAdapter7 = new RibbonAdapter7(mRibbonList);
                final RecyclerView recyclerView7 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager7 = new LinearLayoutManager(c);
                recyclerView7.setLayoutManager(layoutManager7);
                recyclerView7.setAdapter(mAdapter7);
                break;

            case 8:
                RibbonAdapter8 mAdapter8 = new RibbonAdapter8(mRibbonList);
                mRecyclerViewAdapter8 = new RibbonAdapter8(mRibbonList);
                final RecyclerView recyclerView8 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager8 = new LinearLayoutManager(c);
                recyclerView8.setLayoutManager(layoutManager8);
                recyclerView8.setAdapter(mAdapter8);
                break;

            case 9:
                RibbonAdapter9 mAdapter9 = new RibbonAdapter9(mRibbonList);
                mRecyclerViewAdapter9 = new RibbonAdapter9(mRibbonList);
                final RecyclerView recyclerView9 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager9 = new LinearLayoutManager(c);
                recyclerView9.setLayoutManager(layoutManager9);
                recyclerView9.setAdapter(mAdapter9);
                break;

            case 10:
                RibbonAdapter10 mAdapter10 = new RibbonAdapter10(mRibbonList);
                mRecyclerViewAdapter10 = new RibbonAdapter10(mRibbonList);
                final RecyclerView recyclerView10 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager10 = new LinearLayoutManager(c);
                recyclerView10.setLayoutManager(layoutManager10);
                recyclerView10.setAdapter(mAdapter10);
                break;

            case 11:
                RibbonAdapter11 mAdapter11 = new RibbonAdapter11(mRibbonList);
                mRecyclerViewAdapter11 = new RibbonAdapter11(mRibbonList);
                final RecyclerView recyclerView11 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager11 = new LinearLayoutManager(c);
                recyclerView11.setLayoutManager(layoutManager11);
                recyclerView11.setAdapter(mAdapter11);
                break;

            case 12:
                RibbonAdapter12 mAdapter12 = new RibbonAdapter12(mRibbonList);
                mRecyclerViewAdapter12 = new RibbonAdapter12(mRibbonList);
                final RecyclerView recyclerView12 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager12 = new LinearLayoutManager(c);
                recyclerView12.setLayoutManager(layoutManager12);
                recyclerView12.setAdapter(mAdapter12);
                break;

            case 13:
                RibbonAdapter13 mAdapter13 = new RibbonAdapter13(mRibbonList);
                mRecyclerViewAdapter13 = new RibbonAdapter13(mRibbonList);
                final RecyclerView recyclerView13 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager13 = new LinearLayoutManager(c);
                recyclerView13.setLayoutManager(layoutManager13);
                recyclerView13.setAdapter(mAdapter13);
                break;

            case 14:
                RibbonAdapter14 mAdapter14 = new RibbonAdapter14(mRibbonList);
                mRecyclerViewAdapter14 = new RibbonAdapter14(mRibbonList);
                final RecyclerView recyclerView14 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager14 = new LinearLayoutManager(c);
                recyclerView14.setLayoutManager(layoutManager14);
                recyclerView14.setAdapter(mAdapter14);
                break;

            case 15:
                RibbonAdapter15 mAdapter15 = new RibbonAdapter15(mRibbonList);
                mRecyclerViewAdapter15 = new RibbonAdapter15(mRibbonList);
                final RecyclerView recyclerView15 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager15 = new LinearLayoutManager(c);
                recyclerView15.setLayoutManager(layoutManager15);
                recyclerView15.setAdapter(mAdapter15);
                break;

            case 16:
                RibbonAdapter16 mAdapter16 = new RibbonAdapter16(mRibbonList);
                mRecyclerViewAdapter16 = new RibbonAdapter16(mRibbonList);
                final RecyclerView recyclerView16 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager16 = new LinearLayoutManager(c);
                recyclerView16.setLayoutManager(layoutManager16);
                recyclerView16.setAdapter(mAdapter16);
                break;

            case 17:
                RibbonAdapter17 mAdapter17 = new RibbonAdapter17(mRibbonList);
                mRecyclerViewAdapter17 = new RibbonAdapter17(mRibbonList);
                final RecyclerView recyclerView17 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager17 = new LinearLayoutManager(c);
                recyclerView17.setLayoutManager(layoutManager17);
                recyclerView17.setAdapter(mAdapter17);
                break;

            case 18:
                RibbonAdapter18 mAdapter18 = new RibbonAdapter18(mRibbonList);
                mRecyclerViewAdapter18 = new RibbonAdapter18(mRibbonList);
                final RecyclerView recyclerView18 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager18 = new LinearLayoutManager(c);
                recyclerView18.setLayoutManager(layoutManager18);
                recyclerView18.setAdapter(mAdapter18);
                break;

            case 19:
                RibbonAdapter19 mAdapter19 = new RibbonAdapter19(mRibbonList);
                mRecyclerViewAdapter19 = new RibbonAdapter19(mRibbonList);
                final RecyclerView recyclerView19 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager19 = new LinearLayoutManager(c);
                recyclerView19.setLayoutManager(layoutManager19);
                recyclerView19.setAdapter(mAdapter19);
                break;

            case 20:
                RibbonAdapter20 mAdapter20 = new RibbonAdapter20(mRibbonList);
                mRecyclerViewAdapter20 = new RibbonAdapter20(mRibbonList);
                final RecyclerView recyclerView20 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager20 = new LinearLayoutManager(c);
                recyclerView20.setLayoutManager(layoutManager20);
                recyclerView20.setAdapter(mAdapter20);
                break;

            case 21:
                RibbonAdapter21 mAdapter21 = new RibbonAdapter21(mRibbonList);
                mRecyclerViewAdapter21 = new RibbonAdapter21(mRibbonList);
                final RecyclerView recyclerView21 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager21 = new LinearLayoutManager(c);
                recyclerView21.setLayoutManager(layoutManager21);
                recyclerView21.setAdapter(mAdapter21);
                break;

            case 22:
                RibbonAdapter22 mAdapter22 = new RibbonAdapter22(mRibbonList);
                mRecyclerViewAdapter22 = new RibbonAdapter22(mRibbonList);
                final RecyclerView recyclerView22 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager22 = new LinearLayoutManager(c);
                recyclerView22.setLayoutManager(layoutManager22);
                recyclerView22.setAdapter(mAdapter22);
                break;

            case 23:
                RibbonAdapter23 mAdapter23 = new RibbonAdapter23(mRibbonList);
                mRecyclerViewAdapter23 = new RibbonAdapter23(mRibbonList);
                final RecyclerView recyclerView23 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager23 = new LinearLayoutManager(c);
                recyclerView23.setLayoutManager(layoutManager23);
                recyclerView23.setAdapter(mAdapter23);
                break;

            case 24:
                RibbonAdapter24 mAdapter24 = new RibbonAdapter24(mRibbonList);
                mRecyclerViewAdapter24 = new RibbonAdapter24(mRibbonList);
                final RecyclerView recyclerView24 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager24 = new LinearLayoutManager(c);
                recyclerView24.setLayoutManager(layoutManager24);
                recyclerView24.setAdapter(mAdapter24);
                break;

            case 25:
                RibbonAdapter25 mAdapter25 = new RibbonAdapter25(mRibbonList);
                mRecyclerViewAdapter25 = new RibbonAdapter25(mRibbonList);
                final RecyclerView recyclerView25 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager25 = new LinearLayoutManager(c);
                recyclerView25.setLayoutManager(layoutManager25);
                recyclerView25.setAdapter(mAdapter25);
                break;

            case 26:
                RibbonAdapter26 mAdapter26 = new RibbonAdapter26(mRibbonList);
                mRecyclerViewAdapter26 = new RibbonAdapter26(mRibbonList);
                final RecyclerView recyclerView26 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager26 = new LinearLayoutManager(c);
                recyclerView26.setLayoutManager(layoutManager26);
                recyclerView26.setAdapter(mAdapter26);
                break;

            case 27:
                RibbonAdapter27 mAdapter27 = new RibbonAdapter27(mRibbonList);
                mRecyclerViewAdapter27 = new RibbonAdapter27(mRibbonList);
                final RecyclerView recyclerView27 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager27 = new LinearLayoutManager(c);
                recyclerView27.setLayoutManager(layoutManager27);
                recyclerView27.setAdapter(mAdapter27);
                break;

            case 28:
                RibbonAdapter28 mAdapter28 = new RibbonAdapter28(mRibbonList);
                mRecyclerViewAdapter28 = new RibbonAdapter28(mRibbonList);
                final RecyclerView recyclerView28 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager28 = new LinearLayoutManager(c);
                recyclerView28.setLayoutManager(layoutManager28);
                recyclerView28.setAdapter(mAdapter28);
                break;

            case 29:
                RibbonAdapter29 mAdapter29 = new RibbonAdapter29(mRibbonList);
                mRecyclerViewAdapter29 = new RibbonAdapter29(mRibbonList);
                final RecyclerView recyclerView29 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager29 = new LinearLayoutManager(c);
                recyclerView29.setLayoutManager(layoutManager29);
                recyclerView29.setAdapter(mAdapter29);
                break;

            case 30:
                RibbonAdapter30 mAdapter30 = new RibbonAdapter30(mRibbonList);
                mRecyclerViewAdapter30 = new RibbonAdapter30(mRibbonList);
                final RecyclerView recyclerView30 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager30 = new LinearLayoutManager(c);
                recyclerView30.setLayoutManager(layoutManager30);
                recyclerView30.setAdapter(mAdapter30);
                break;

            case 31:
                RibbonAdapter31 mAdapter31 = new RibbonAdapter31(mRibbonList);
                mRecyclerViewAdapter31 = new RibbonAdapter31(mRibbonList);
                final RecyclerView recyclerView31 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager31 = new LinearLayoutManager(c);
                recyclerView31.setLayoutManager(layoutManager31);
                recyclerView31.setAdapter(mAdapter31);
                break;

            case 32:
                RibbonAdapter32 mAdapter32 = new RibbonAdapter32(mRibbonList);
                mRecyclerViewAdapter32 = new RibbonAdapter32(mRibbonList);
                final RecyclerView recyclerView32 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager32 = new LinearLayoutManager(c);
                recyclerView32.setLayoutManager(layoutManager32);
                recyclerView32.setAdapter(mAdapter32);
                break;

            case 33:
                RibbonAdapter33 mAdapter33 = new RibbonAdapter33(mRibbonList);
                mRecyclerViewAdapter33 = new RibbonAdapter33(mRibbonList);
                final RecyclerView recyclerView33 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager33 = new LinearLayoutManager(c);
                recyclerView33.setLayoutManager(layoutManager33);
                recyclerView33.setAdapter(mAdapter33);
                break;

            case 34:
                RibbonAdapter34 mAdapter34 = new RibbonAdapter34(mRibbonList);
                mRecyclerViewAdapter34 = new RibbonAdapter34(mRibbonList);
                final RecyclerView recyclerView34 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager34 = new LinearLayoutManager(c);
                recyclerView34.setLayoutManager(layoutManager34);
                recyclerView34.setAdapter(mAdapter34);
                break;

            case 35:
                RibbonAdapter35 mAdapter35 = new RibbonAdapter35(mRibbonList);
                mRecyclerViewAdapter35 = new RibbonAdapter35(mRibbonList);
                final RecyclerView recyclerView35 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager35 = new LinearLayoutManager(c);
                recyclerView35.setLayoutManager(layoutManager35);
                recyclerView35.setAdapter(mAdapter35);
                break;

            case 36:
                RibbonAdapter36 mAdapter36 = new RibbonAdapter36(mRibbonList);
                mRecyclerViewAdapter36 = new RibbonAdapter36(mRibbonList);
                final RecyclerView recyclerView36 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager36 = new LinearLayoutManager(c);
                recyclerView36.setLayoutManager(layoutManager36);
                recyclerView36.setAdapter(mAdapter36);
                break;

            case 37:
                RibbonAdapter37 mAdapter37 = new RibbonAdapter37(mRibbonList);
                mRecyclerViewAdapter37 = new RibbonAdapter37(mRibbonList);
                final RecyclerView recyclerView37 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager37 = new LinearLayoutManager(c);
                recyclerView37.setLayoutManager(layoutManager37);
                recyclerView37.setAdapter(mAdapter37);
                break;

            case 38:
                RibbonAdapter38 mAdapter38 = new RibbonAdapter38(mRibbonList);
                mRecyclerViewAdapter38 = new RibbonAdapter38(mRibbonList);
                final RecyclerView recyclerView38 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager38 = new LinearLayoutManager(c);
                recyclerView38.setLayoutManager(layoutManager38);
                recyclerView38.setAdapter(mAdapter38);
                break;

            case 39:
                RibbonAdapter39 mAdapter39 = new RibbonAdapter39(mRibbonList);
                mRecyclerViewAdapter39 = new RibbonAdapter39(mRibbonList);
                final RecyclerView recyclerView39 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager39 = new LinearLayoutManager(c);
                recyclerView39.setLayoutManager(layoutManager39);
                recyclerView39.setAdapter(mAdapter39);
                break;

            case 40:
                RibbonAdapter40 mAdapter40 = new RibbonAdapter40(mRibbonList);
                mRecyclerViewAdapter40 = new RibbonAdapter40(mRibbonList);
                final RecyclerView recyclerView40 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager40 = new LinearLayoutManager(c);
                recyclerView40.setLayoutManager(layoutManager40);
                recyclerView40.setAdapter(mAdapter40);
                break;

            case 41:
                RibbonAdapter41 mAdapter41 = new RibbonAdapter41(mRibbonList);
                mRecyclerViewAdapter41 = new RibbonAdapter41(mRibbonList);
                final RecyclerView recyclerView41 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager41 = new LinearLayoutManager(c);
                recyclerView41.setLayoutManager(layoutManager41);
                recyclerView41.setAdapter(mAdapter41);
                break;

            case 42:
                RibbonAdapter42 mAdapter42 = new RibbonAdapter42(mRibbonList);
                mRecyclerViewAdapter42 = new RibbonAdapter42(mRibbonList);
                final RecyclerView recyclerView42 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager42 = new LinearLayoutManager(c);
                recyclerView42.setLayoutManager(layoutManager42);
                recyclerView42.setAdapter(mAdapter42);
                break;

            case 43:
                RibbonAdapter43 mAdapter43 = new RibbonAdapter43(mRibbonList);
                mRecyclerViewAdapter43 = new RibbonAdapter43(mRibbonList);
                final RecyclerView recyclerView43 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager43 = new LinearLayoutManager(c);
                recyclerView43.setLayoutManager(layoutManager43);
                recyclerView43.setAdapter(mAdapter43);
                break;

            case 44:
                RibbonAdapter44 mAdapter44 = new RibbonAdapter44(mRibbonList);
                mRecyclerViewAdapter44 = new RibbonAdapter44(mRibbonList);
                final RecyclerView recyclerView44 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager44 = new LinearLayoutManager(c);
                recyclerView44.setLayoutManager(layoutManager44);
                recyclerView44.setAdapter(mAdapter44);
                break;

            case 45:
                RibbonAdapter45 mAdapter45 = new RibbonAdapter45(mRibbonList);
                mRecyclerViewAdapter45 = new RibbonAdapter45(mRibbonList);
                final RecyclerView recyclerView45 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager45 = new LinearLayoutManager(c);
                recyclerView45.setLayoutManager(layoutManager45);
                recyclerView45.setAdapter(mAdapter45);
                break;

            case 46:
                RibbonAdapter46 mAdapter46 = new RibbonAdapter46(mRibbonList);
                mRecyclerViewAdapter46 = new RibbonAdapter46(mRibbonList);
                final RecyclerView recyclerView46 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager46 = new LinearLayoutManager(c);
                recyclerView46.setLayoutManager(layoutManager46);
                recyclerView46.setAdapter(mAdapter46);
                break;

            case 47:
                RibbonAdapter47 mAdapter47 = new RibbonAdapter47(mRibbonList);
                mRecyclerViewAdapter47 = new RibbonAdapter47(mRibbonList);
                final RecyclerView recyclerView47 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager47 = new LinearLayoutManager(c);
                recyclerView47.setLayoutManager(layoutManager47);
                recyclerView47.setAdapter(mAdapter47);
                break;

            case 48:
                RibbonAdapter48 mAdapter48 = new RibbonAdapter48(mRibbonList);
                mRecyclerViewAdapter48 = new RibbonAdapter48(mRibbonList);
                final RecyclerView recyclerView48 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager48 = new LinearLayoutManager(c);
                recyclerView48.setLayoutManager(layoutManager48);
                recyclerView48.setAdapter(mAdapter48);
                break;

            case 49:
                RibbonAdapter49 mAdapter49 = new RibbonAdapter49(mRibbonList);
                mRecyclerViewAdapter49 = new RibbonAdapter49(mRibbonList);
                final RecyclerView recyclerView49 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager49 = new LinearLayoutManager(c);
                recyclerView49.setLayoutManager(layoutManager49);
                recyclerView49.setAdapter(mAdapter49);
                break;

            case 50:
                RibbonAdapter50 mAdapter50 = new RibbonAdapter50(mRibbonList);
                mRecyclerViewAdapter50 = new RibbonAdapter50(mRibbonList);
                final RecyclerView recyclerView50 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager50 = new LinearLayoutManager(c);
                recyclerView50.setLayoutManager(layoutManager50);
                recyclerView50.setAdapter(mAdapter50);
                break;

        }
        // Inflate the layout for this fragment
        return view;
    }

    public void showPopup(View v, RecyclerView holder, ArraySet<ImageView> oaks) {
        new Thread() {
            public void run() {
                PopupMenu oakMenu = new PopupMenu(context, v);
                oakMenu.getMenuInflater().inflate(R.menu.oak_leaf_menu, oakMenu.getMenu());
                oakMenu.setOnMenuItemClickListener(Award2Fragment.this);
                oakMenu.inflate(R.menu.oak_leaf_menu);
                oakMenu.show();
            }
        };
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(context, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(context, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(context, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(context, "Item 4 clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }

    public void createRibbonList() {
        mRibbonList = new ArrayList<>();
        //for(int i = 0; i < fromAward.size(); i++)
        System.out.println(fromAward);
        fromAward.trimToSize();
        System.out.println(fromAward);
        int tots = fromAward.size();
        System.out.println("Size of tots"  + tots);
        /*
        if(fromAward.size() == 1){
            mRibbonList.add(new RibbonItem.RibbonItem1(fromAward));
        } else if(fromAward.size() ==2){
            mRibbonList.add(new RibbonItem.RibbonItem2(fromAward));
        }
        */
        switch(tots) {
            case 1:
                mRibbonList.add(new RibbonItem.RibbonItem1(fromAward));
                break;
            case 2:
                mRibbonList.add(new RibbonItem.RibbonItem2(fromAward));
                break;
            case 3:
                mRibbonList.add(new RibbonItem.RibbonItem3(fromAward));
                break;
            case 4:
                mRibbonList.add(new RibbonItem.RibbonItem4(fromAward));
                break;
            case 5:
                mRibbonList.add(new RibbonItem.RibbonItem5(fromAward));
                break;
            case 6:
                mRibbonList.add(new RibbonItem.RibbonItem6(fromAward));
                break;
            case 7:
                mRibbonList.add(new RibbonItem.RibbonItem7(fromAward));
                break;
            case 8:
                mRibbonList.add(new RibbonItem.RibbonItem8(fromAward));
                break;
            case 9:
                mRibbonList.add(new RibbonItem.RibbonItem9(fromAward));
                break;
            case 10:
                mRibbonList.add(new RibbonItem.RibbonItem10(fromAward));
                break;
            case 11:
                mRibbonList.add(new RibbonItem.RibbonItem11(fromAward));
                break;
            case 12:
                mRibbonList.add(new RibbonItem.RibbonItem12(fromAward));
                break;
            case 13:
                mRibbonList.add(new RibbonItem.RibbonItem13(fromAward));
                break;
            case 14:
                mRibbonList.add(new RibbonItem.RibbonItem14(fromAward));
                break;
            case 15:
                mRibbonList.add(new RibbonItem.RibbonItem15(fromAward));
                break;
            case 16:
                mRibbonList.add(new RibbonItem.RibbonItem16(fromAward));
                break;
            case 17:
                mRibbonList.add(new RibbonItem.RibbonItem17(fromAward));
                break;
            case 18:
                mRibbonList.add(new RibbonItem.RibbonItem18(fromAward));
                break;
            case 19:
                mRibbonList.add(new RibbonItem.RibbonItem19(fromAward));
                break;
            case 20:
                mRibbonList.add(new RibbonItem.RibbonItem20(fromAward));
                break;
            case 21:
                mRibbonList.add(new RibbonItem.RibbonItem21(fromAward));
                break;
            case 22:
                mRibbonList.add(new RibbonItem.RibbonItem22(fromAward));
                break;
            case 23:
                mRibbonList.add(new RibbonItem.RibbonItem23(fromAward));
                break;
            case 24:
                mRibbonList.add(new RibbonItem.RibbonItem24(fromAward));
                break;
            case 25:
                mRibbonList.add(new RibbonItem.RibbonItem25(fromAward));
                break;
            case 26:
                mRibbonList.add(new RibbonItem.RibbonItem26(fromAward));
                break;
            case 27:
                mRibbonList.add(new RibbonItem.RibbonItem27(fromAward));
                break;
            case 28:
                mRibbonList.add(new RibbonItem.RibbonItem28(fromAward));
                break;
            case 29:
                mRibbonList.add(new RibbonItem.RibbonItem29(fromAward));
                break;
            case 30:
                mRibbonList.add(new RibbonItem.RibbonItem30(fromAward));
                break;
            case 31:
                mRibbonList.add(new RibbonItem.RibbonItem31(fromAward));
                break;
            case 32:
                mRibbonList.add(new RibbonItem.RibbonItem32(fromAward));
                break;
            case 33:
                mRibbonList.add(new RibbonItem.RibbonItem33(fromAward));
                break;
            case 34:
                mRibbonList.add(new RibbonItem.RibbonItem34(fromAward));
                break;
            case 35:
                mRibbonList.add(new RibbonItem.RibbonItem35(fromAward));
                break;
            case 36:
                mRibbonList.add(new RibbonItem.RibbonItem36(fromAward));
                break;
            case 37:
                mRibbonList.add(new RibbonItem.RibbonItem37(fromAward));
                break;
            case 38:
                mRibbonList.add(new RibbonItem.RibbonItem38(fromAward));
                break;
            case 39:
                mRibbonList.add(new RibbonItem.RibbonItem39(fromAward));
                break;
            case 40:
                mRibbonList.add(new RibbonItem.RibbonItem40(fromAward));
                break;
            case 41:
                mRibbonList.add(new RibbonItem.RibbonItem41(fromAward));
                break;
            case 42:
                mRibbonList.add(new RibbonItem.RibbonItem42(fromAward));
                break;
            case 43:
                mRibbonList.add(new RibbonItem.RibbonItem43(fromAward));
                break;
            case 44:
                mRibbonList.add(new RibbonItem.RibbonItem44(fromAward));
                break;
            case 45:
                mRibbonList.add(new RibbonItem.RibbonItem45(fromAward));
                break;
            case 46:
                mRibbonList.add(new RibbonItem.RibbonItem46(fromAward));
                break;
            case 47:
                mRibbonList.add(new RibbonItem.RibbonItem47(fromAward));
                break;
            case 48:
                mRibbonList.add(new RibbonItem.RibbonItem48(fromAward));
                break;
            case 49:
                mRibbonList.add(new RibbonItem.RibbonItem49(fromAward));
                break;
            case 50:
                mRibbonList.add(new RibbonItem.RibbonItem50(fromAward));
                break;
        }
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewRibbonRack);
        //ZoomageView zoomageView = view.findViewById(R.id.myZoomageView);
        view.setDrawingCacheEnabled(true);
        //ConstraintLayout uniformConstraint = view.findViewById(R.id.uniform_constraint);
        Button convertView = view.findViewById(R.id.btn_populateFromDialog);
        //ImageView holderConvert = view.findViewById(R.id.convertedHolder);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bpm = Bitmap.createBitmap(recyclerView.getWidth(), recyclerView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bpm);
                recyclerView.draw(canvas);
                Drawable d = new BitmapDrawable(getResources(), bpm);
                //zoomageView.setDrawableResource(d);
                bitmapDrawableArray.add(d);
                System.out.println(bitmapDrawableArray);
                NavHostFragment.findNavController(Award2Fragment.this)
                        .navigate(R.id.action_award2Fragment_to_award2Dialog);
                //System.out.println(bitmap);
            }
        });
        /*
         */
    }

}