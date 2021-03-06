package test.azizi.alopeyk.ui.main.adapter;

import android.Manifest;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import test.azizi.alopeyk.R;
import test.azizi.alopeyk.di.component.ActivityComponent;
import test.azizi.alopeyk.model.ProductDto;
import test.azizi.alopeyk.tools.Utility;
import test.azizi.alopeyk.ui.base.BaseViewHolder;
import test.azizi.alopeyk.ui.map.MapActivity;
import test.azizi.alopeyk.R;

/**
 * Created by MahtabAzizi on 12/12/2018.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    @Inject
    AppCompatActivity activity;
    private List<ProductDto> productDtos;
    private final static int MAP_REQUEST_CODE=100;

    public void addItems(List<ProductDto> productDtoList) {


        productDtos.addAll(productDtoList);

        notifyDataSetChanged();
    }


    public ProductAdapter(List<ProductDto> productDtos) {
        this.productDtos = productDtos;


    }
    public void setComponent(ActivityComponent component) {
        component.inject(this);


    }
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        return new ProductViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_item, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder holder, final int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemCount() {
        return productDtos.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }



    public class ProductViewHolder extends BaseViewHolder {


        private int position;
        @BindView(R.id.product_price)
        TextView tvPrice;
        @BindView(R.id.product_title)
        TextView tvProductTitle;
        @BindView(R.id.button_buy)
        TextView tvButtonBuy;
        @OnClick(R.id.button_buy)
        void onBuyClick() {
            new TedPermission(activity)
                    .setPermissionListener(new PermissionListener() {
                        @Override
                        public void onPermissionGranted() {
                            activity.startActivityForResult(new Intent(activity, MapActivity.class)
                                    .putExtra("product",new Gson().toJson(productDtos.get(position))),MAP_REQUEST_CODE);
                        }
                        @Override
                        public void onPermissionDenied(ArrayList<String> deniedPermissions) {
                        }
                    })
                    .setDeniedMessage("If you reject permission,you can not use this application, Please turn on permissions at [Setting] > [Permission]")
                    .setPermissions(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION)
                    .check();



        }

        ProductViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }

        @Override
        public void onBind(int position) {
            super.onBind(position);
            this.position = position;
            tvProductTitle.setText(productDtos.get(position).getProductName());
            StringBuilder priceBuilder= new StringBuilder();
            priceBuilder.append(productDtos.get(position).getProductPrice());
            priceBuilder.append(itemView.getContext().getString(R.string.rials));
            tvPrice.setText(priceBuilder);
        }

    }
}
