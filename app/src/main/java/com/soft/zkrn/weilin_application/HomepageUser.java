package com.soft.zkrn.weilin_application;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class HomepageUser extends Fragment {

    private LinearLayout ll_message;
    private LinearLayout ll_community;
    private LinearLayout ll_gift;
    private LinearLayout ll_recharge;
    private LinearLayout ll_setting;
    private LinearLayout ll_information;
//    private Button bt_signout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homepage_frag_user,container,false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        bt_signout = (Button) getActivity().findViewById(R.id.bt_HomepageUser_signout);
        ll_message = getActivity().findViewById(R.id.ll_HomepageUser_message);
        ll_community = getActivity().findViewById(R.id.ll_HomepageUser_community);
        ll_gift = getActivity().findViewById(R.id.ll_HomepageUser_gift);
        ll_recharge = getActivity().findViewById(R.id.ll_HomepageUser_recharge);
        ll_setting = getActivity().findViewById(R.id.ll_HomepageUser_setting);
        ll_information = getActivity().findViewById(R.id.ll_HomepageUser_information);



        ll_information.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), UserInformation_Mainpage.class));
            }
        });

        ll_message.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Message_Mainpage.class));
            }
        });

        ll_community.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Community_Mainpage.class));
            }
        });

        ll_gift.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Gift_Mainpage.class));
            }
        });

        ll_recharge.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(),Recharge_Mainpage.class));
            }
        });

        ll_setting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                getActivity().startActivity(new Intent(getActivity(),Recharge_Mainpage.class));
            }
        });

        ll_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(),Setting_Mainpage.class));
            }
        });

    }

}
