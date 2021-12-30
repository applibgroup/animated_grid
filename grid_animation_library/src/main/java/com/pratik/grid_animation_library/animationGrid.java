package com.pratik.grid_animation_library;


import ohos.agp.components.*;
import ohos.agp.components.element.Element;
import ohos.agp.components.webengine.WebView;
import ohos.agp.utils.Color;
import ohos.app.Context;


public class animationGrid extends StackLayout {


    /**
     * root layout, parent of other components {@link animationGrid#textA} {@link animationGrid#iconA}
     */
    private DirectionalLayout root;

    /**
     * button text, shown below of the icon
     */
    private Text textA;
    /**
     * icon component shown on above of the button's text
     */



    //private webview iconC;
    private WebView iconA;

    public animationGrid(Context context) {
        super(context);
        init(null);
    }

    public animationGrid(Context context, AttrSet attrSet) {
        super(context, attrSet);
        init(attrSet);
    }

    public animationGrid(Context context, AttrSet attrSet, String styleName) {
        super(context, attrSet, styleName);

        init(attrSet);
    }

    private void init(AttrSet attrSet) {

        LayoutScatter.getInstance(getContext())
                .parse(ResourceTable.Layout_animation_grid, this, true);

        root = (DirectionalLayout) findComponentById(ResourceTable.Id_button_root);
        textA = (Text) findComponentById(ResourceTable.Id_button_text);

        iconA = (WebView) findComponentById(ResourceTable.Id_button_icon);












    }


    /**
     * set button text
     *
     * @param textRes resource id of text that will be shown inside button
     */
    public void setText(int textRes) {
        if (textRes != -1) {
            this.textA.setText(textRes);
        }
    }

    /**
     * show icon on above side of the text
     *
     * @param imageElement image element ex: {@link webView link}
     *
     */

   public void setIconRes(String imageElement) {



       iconA.getWebConfig().setJavaScriptPermit(true);





       iconA.load(imageElement);











   }







    /**
     * set button text
     *
     * @param text will be shown inside button
     */
    public void setText(String text) {
        if (text != null && !text.isEmpty()) {
            this.textA.setText(text);
        }
    }




    /**
     * change button background
     *
     * @param shapeElement element that will be set as background
     */
    public void setBg(Element shapeElement) {

        root.setBackground(shapeElement);
    }


    /**
     * change button background using graphic resource.
     *
     * @param bgResId the resource id of the background, ex: {@see ResourceTable.Graphic_bg_button_gray}
     */
    public void setBg(int bgResId) {

        UiUtils.setBg(root, bgResId);
    }


    public void setTextColor(Color color) {

        textA.setTextColor(color);
    }



}