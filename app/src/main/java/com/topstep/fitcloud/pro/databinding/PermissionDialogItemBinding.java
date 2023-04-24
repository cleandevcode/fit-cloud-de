package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class PermissionDialogItemBinding implements a {
    public final TextView permissionDes;
    public final TextView permissionExplain;
    public final ImageView permissionIcon;
    public final LinearLayout permissionInfo;
    public final ImageView permissionMore;
    public final TextView permissionText;
    private final RelativeLayout rootView;

    private PermissionDialogItemBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.permissionDes = textView;
        this.permissionExplain = textView2;
        this.permissionIcon = imageView;
        this.permissionInfo = linearLayout;
        this.permissionMore = imageView2;
        this.permissionText = textView3;
    }

    public static PermissionDialogItemBinding bind(View view) {
        int i10 = R.id.permissionDes;
        TextView textView = (TextView) c.m(view, R.id.permissionDes);
        if (textView != null) {
            i10 = R.id.permissionExplain;
            TextView textView2 = (TextView) c.m(view, R.id.permissionExplain);
            if (textView2 != null) {
                i10 = R.id.permissionIcon;
                ImageView imageView = (ImageView) c.m(view, R.id.permissionIcon);
                if (imageView != null) {
                    i10 = R.id.permissionInfo;
                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.permissionInfo);
                    if (linearLayout != null) {
                        i10 = R.id.permissionMore;
                        ImageView imageView2 = (ImageView) c.m(view, R.id.permissionMore);
                        if (imageView2 != null) {
                            i10 = R.id.permissionText;
                            TextView textView3 = (TextView) c.m(view, R.id.permissionText);
                            if (textView3 != null) {
                                return new PermissionDialogItemBinding((RelativeLayout) view, textView, textView2, imageView, linearLayout, imageView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PermissionDialogItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PermissionDialogItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.permission_dialog_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
