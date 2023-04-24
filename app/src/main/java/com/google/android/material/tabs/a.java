package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import z9.r;

/* loaded from: classes.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.B && (view instanceof TabLayout.i)) {
            TabLayout.i iVar = (TabLayout.i) view;
            int contentWidth = iVar.getContentWidth();
            int contentHeight = iVar.getContentHeight();
            int b10 = (int) r.b(iVar.getContext(), 24);
            if (contentWidth < b10) {
                contentWidth = b10;
            }
            int right = (iVar.getRight() + iVar.getLeft()) / 2;
            int bottom = (iVar.getBottom() + iVar.getTop()) / 2;
            int i10 = contentWidth / 2;
            return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(h9.a.b(f10, (int) a10.left, (int) a11.left), drawable.getBounds().top, h9.a.b(f10, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}
