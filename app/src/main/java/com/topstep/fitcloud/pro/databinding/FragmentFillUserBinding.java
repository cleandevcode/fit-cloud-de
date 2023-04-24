package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFillUserBinding implements a {
    public final Button btnCommit;
    public final TextInputEditText editNickName;
    public final ImageView imgAvatar;
    public final TextInputLayout inputPwd;
    public final PreferenceItem itemBirthday;
    public final PreferenceItem itemHeight;
    public final PreferenceItem itemSex;
    public final PreferenceItem itemWeight;
    private final LinearLayout rootView;
    public final FitPaddingMaterialToolbar toolbar;

    private FragmentFillUserBinding(LinearLayout linearLayout, Button button, TextInputEditText textInputEditText, ImageView imageView, TextInputLayout textInputLayout, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, FitPaddingMaterialToolbar fitPaddingMaterialToolbar) {
        this.rootView = linearLayout;
        this.btnCommit = button;
        this.editNickName = textInputEditText;
        this.imgAvatar = imageView;
        this.inputPwd = textInputLayout;
        this.itemBirthday = preferenceItem;
        this.itemHeight = preferenceItem2;
        this.itemSex = preferenceItem3;
        this.itemWeight = preferenceItem4;
        this.toolbar = fitPaddingMaterialToolbar;
    }

    public static FragmentFillUserBinding bind(View view) {
        int i10 = R.id.btn_commit;
        Button button = (Button) c.m(view, R.id.btn_commit);
        if (button != null) {
            i10 = R.id.edit_nick_name;
            TextInputEditText textInputEditText = (TextInputEditText) c.m(view, R.id.edit_nick_name);
            if (textInputEditText != null) {
                i10 = R.id.img_avatar;
                ImageView imageView = (ImageView) c.m(view, R.id.img_avatar);
                if (imageView != null) {
                    i10 = R.id.input_pwd;
                    TextInputLayout textInputLayout = (TextInputLayout) c.m(view, R.id.input_pwd);
                    if (textInputLayout != null) {
                        i10 = R.id.item_birthday;
                        PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_birthday);
                        if (preferenceItem != null) {
                            i10 = R.id.item_height;
                            PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_height);
                            if (preferenceItem2 != null) {
                                i10 = R.id.item_sex;
                                PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_sex);
                                if (preferenceItem3 != null) {
                                    i10 = R.id.item_weight;
                                    PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_weight);
                                    if (preferenceItem4 != null) {
                                        i10 = R.id.toolbar;
                                        FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                                        if (fitPaddingMaterialToolbar != null) {
                                            return new FragmentFillUserBinding((LinearLayout) view, button, textInputEditText, imageView, textInputLayout, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, fitPaddingMaterialToolbar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFillUserBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFillUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fill_user, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
