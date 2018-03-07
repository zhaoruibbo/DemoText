package com.example.demotext;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    private RecyclerView recycler;
    private List<Bean.ResultBean.DataBean> list;
    private LinearLayoutManager mLayoutManager;
    private RecyclerAdapter adapter;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_fragment1, container, false);

        initView(inflate);
        initData();
        return inflate;
    }

    private void initView(View inflate) {
        recycler = inflate.findViewById(R.id.recycler);
        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        adapter = new RecyclerAdapter(list , getActivity());
        recycler.setLayoutManager(mLayoutManager);
        recycler.setAdapter(adapter);
    }

    private void initData() {
        OkHttpUntils.getInstance().sendGet("", new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Gson gson = new Gson();
                Bean bean = gson.fromJson(string, Bean.class);
                list = new ArrayList<>();
                list.addAll(bean.getResult().getData());
            }
        });

    }

}
