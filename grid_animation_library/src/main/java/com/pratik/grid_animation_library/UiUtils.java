package com.pratik.grid_animation_library;

import ohos.agp.components.*;
import ohos.agp.components.element.ElementScatter;
import ohos.agp.utils.Color;
import ohos.app.Context;
import ohos.global.resource.NotExistException;
import ohos.global.resource.WrongTypeException;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;


import java.io.*;

public class UiUtils {

    private static final String ERROR_1 ="error";



    /**
     * set background to a component
     * @param component the component which background will be upated
     * @param resId resource id of background element, ex: ResourceTable.Graphic_bg_round
     */
    public static void setBg(Component component, int resId) {
        component.setBackground(ElementScatter.getInstance(component.getContext()).parse(resId));
    }

    /**
     * show component, similar to View.VISIBLE on android
     * @param component
     */
    public static void visible(Component component) {
        component.setVisibility(Component.VISIBLE);
    }

    /**
     * make component invisible, while reserving its place in the layout, similar to View.INVISIBLE on android
     * @param component
     */
    public static void invisible(Component component) {
        component.setVisibility(Component.INVISIBLE);
    }

    /**
     * hide component from layout and free its reserved space in layout, similar to View.Gone on android
     * @param component
     */
    public static void hide(Component component) {
        component.setVisibility(Component.HIDE);
    }

    /**
     * get color from resources
     * @param colorResId color resource id, ex: ResourceTable.Color_primary
     * @return instance of Color holding color information of {@param colorRsId}
     */
    public static Color getColor(Context context, int colorResId) {
        LogManager slg = LogManager.getLogManager();

        Logger log = slg.getLogger(Logger.GLOBAL_LOGGER_NAME);

        try {
            return new Color( context.getResourceManager().getElement(colorResId).getColor());
        } catch (IOException e) {
            log.log(Level.WARNING, ERROR_1);
        } catch (NotExistException e) {
            log.log(Level.WARNING, ERROR_1);
        } catch (WrongTypeException e) {
            log.log(Level.WARNING, ERROR_1);
        }


        return null;
    }


    /**
     * return String from resource
     * @param resId string resource id, ex: ResourceTable.String_app_name
     * @return String value retrieved from string.json
     */

    public static String getString(Context context, int resId) {
        LogManager slg1 = LogManager.getLogManager();

        Logger log1 = slg1.getLogger(Logger.GLOBAL_LOGGER_NAME);
        try {
            return context.getResourceManager().getElement(resId).getString();
        } catch (Exception e) {
            log1.log(Level.WARNING, ERROR_1);
        }
        return null;
    }




}