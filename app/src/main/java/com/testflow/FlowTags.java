package com.testflow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.flexbox.AlignContent;
import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayout;

/**
 * Created by yarh on 7/20/17.
 */

public class FlowTags extends FlexboxLayout {

  public FlowTags(Context context) {
    super(context);
    init();
  }

  public FlowTags(Context context, AttributeSet attributeSet) {
    super(context, attributeSet);
    init();
  }

  public FlowTags(Context context, AttributeSet attributeSet, int defStyle) {
    super(context, attributeSet, defStyle);
    init();
  }

  void init() {
    setAlignItems(AlignItems.STRETCH);
    setAlignContent(AlignContent.STRETCH);
    setFlexWrap(FlexWrap.WRAP);
    setFlexDirection(FlexDirection.ROW);
  }

  public void setTags() {
    removeAllViews();
    for (int i = 0; i < 5; i++) {
      createTag(String.valueOf(i));
    }
  }

  private void createTag(String s) {
    View v = LayoutInflater.from(getContext()).inflate(R.layout.listitem_tag, this, false);
    FlexboxLayout.LayoutParams lp = (FlexboxLayout.LayoutParams) v.getLayoutParams();
    lp.setOrder(-1);
    lp.setFlexGrow(2);
    v.setLayoutParams(lp);
    TextView t = (TextView) v.findViewById(R.id.text1);
    t.setText(s);
    addView(v);
  }
}

