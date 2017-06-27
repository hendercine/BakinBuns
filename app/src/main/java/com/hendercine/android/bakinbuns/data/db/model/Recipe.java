/*
 * Created by James Henderson on 2017
 * Copyright (c) Hendercine Productions and James Henderson 2017.
 * All rights reserved.
 *
 * Last modified 6/26/17 8:54 AM
 */

package com.hendercine.android.bakinbuns.data.db.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;

/**
 * BakinBuns created by hendercine on 6/26/17.
 */

@Entity(nameInDb = "recipe")
public class Recipe {

    @Expose
    @SerializedName("id")
    @Id
    private long id;

    @Expose
    @SerializedName("recipe_name")
    @Property(nameInDb = "recipe_name")
    private String recipeName;

    @ToMany(referencedJoinProperty = "recipeId")
    private List<RecipeStep> recipeStepList;

    @ToMany(referencedJoinProperty = "recipeId")
    private List<Ingredients> ingredientsList;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1947830398)
    private transient RecipeDao myDao;


    public Recipe() {
    }

    @Generated(hash = 647612567)
    public Recipe(long id, String recipeName) {
        this.id = id;
        this.recipeName = recipeName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1174902388)
    public List<RecipeStep> getRecipeStepList() {
        if (recipeStepList == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            RecipeStepDao targetDao = daoSession.getRecipeStepDao();
            List<RecipeStep> recipeStepListNew = targetDao._queryRecipe_RecipeStepList(id);
            synchronized (this) {
                if (recipeStepList == null) {
                    recipeStepList = recipeStepListNew;
                }
            }
        }
        return recipeStepList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1544548276)
    public synchronized void resetRecipeStepList() {
        recipeStepList = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1713959885)
    public List<Ingredients> getIngredientsList() {
        if (ingredientsList == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            IngredientsDao targetDao = daoSession.getIngredientsDao();
            List<Ingredients> ingredientsListNew = targetDao._queryRecipe_IngredientsList(id);
            synchronized (this) {
                if (ingredientsList == null) {
                    ingredientsList = ingredientsListNew;
                }
            }
        }
        return ingredientsList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 913976339)
    public synchronized void resetIngredientsList() {
        ingredientsList = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1484851246)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getRecipeDao() : null;
    }

}