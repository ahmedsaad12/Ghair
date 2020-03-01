package com.endpoint.ghair.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;

import com.endpoint.ghair.R;
import com.endpoint.ghair.databinding.SpinnerBrandRowBinding;
import com.endpoint.ghair.databinding.SpinnerCityRowBinding;
import com.endpoint.ghair.models.Brand_Model;
import com.endpoint.ghair.models.Cities_Model;

import java.util.List;
import java.util.Locale;

import io.paperdb.Paper;

public class SpinnerBrandAdapter extends BaseAdapter {
    private List<Brand_Model.Data> dataList;
    private Context context;
    private String lang;
    public SpinnerBrandAdapter(List<Brand_Model.Data> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
        Paper.init(context);
        lang = Paper.book().read("lang", Locale.getDefault().getLanguage());
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int i) {
        return dataList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        @SuppressLint("ViewHolder") SpinnerBrandRowBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.spinner_brand_row,viewGroup,false);
        binding.setLang(lang);
        binding.setBrandModel(dataList.get(i));
        return binding.getRoot();
    }
}
