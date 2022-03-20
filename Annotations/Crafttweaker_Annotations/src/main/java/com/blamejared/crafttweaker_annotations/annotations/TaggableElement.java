package com.blamejared.crafttweaker_annotations.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TaggableElement {
    
    /**
     * The name of the registry that holds this element.
     *
     * Examples:
     * - "minecraft:item" for Item
     * - "minecraft:worldgen/biome" for Biome
     *
     * @return The name of the registry that holds this element.
     */
    String value();
    
}
