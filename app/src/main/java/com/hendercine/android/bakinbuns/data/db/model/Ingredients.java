/*
 * Created by James Henderson on 2017
 * Copyright (c) Hendercine Productions and James Henderson 2017.
 * All rights reserved.
 *
 * Last modified 6/26/17 5:51 PM
 */

package com.hendercine.android.bakinbuns.data.db.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * BakinBuns created by hendercine on 6/26/17.
 */

@Entity(nameInDb = "ingredients")
public class Ingredients {

    @Expose
    @SerializedName("id")
    @Id(autoincrement = true)
    private Long id;

    @Expose
    @SerializedName("quantity")
    @Property(nameInDb = "quantity")
    private String ingredientQuantity;

    @Expose
    @SerializedName("measure")
    @Property(nameInDb = "measure")
    private String ingredientMeasure;

    @Expose
    @SerializedName("ingredient")
    @Property(nameInDb = "ingredient")
    private String ingredientName;

    @Expose
    @SerializedName("recipe_id")
    @Property(nameInDb = "recipe_id")
    private Long recipeId;

}