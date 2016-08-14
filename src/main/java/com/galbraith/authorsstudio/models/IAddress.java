package com.galbraith.authorsstudio.models;

/**
 * An interface defining the methods of Address objects.
 * 
 * @author Sean Galbraith
 */
public interface IAddress {

    /**
     * Gets the name or number of the flat of this address.
     * 
     * @return The name or number of the flat.
     */
    String getFlatNumberOrName();
    
    /**
     * Gets the name or number of the building of this address.
     * 
     * @return The name or number of the building.
     */
    String getBuildingNumberOrName();
    
    /**
     * Gets the name of the street of this address.
     * 
     * @return The name of the street.
     */
    String getStreetName();
    
    /**
     * Gets the name of the town or city of this address.
     * 
     * @return The name of the town or city.
     */
    String getTownOrCityName();
    
    /**
     * Gets the name of the region of this address.
     * 
     * @return The name of the region.
     */
    String getRegionName();
    
    /**
     * Gets the Post Code of this address.
     * 
     * @return The postcode.
     */
    String getPostcode();
    
    /**
     * Gets a formatted String containing the full details of this address.
     * 
     * @return The formatted representation of the full address.
     */
    String getFullAddress();
    
    /**
     * Sets the name or number of the flat of this address.
     * 
     * @param flatNumberOrName The name or number of the flat.
     */
    void setFlatNumberOrName(String flatNumberOrName);
    
    /**
     * Sets the name or number of the building of this address.
     * 
     * @param buildingNumberOrName The name or number of this address.
     */
    void setBuidlingNumberOrName(String buildingNumberOrName);
    
    /**
     * Sets the name of the street of this address.
     * 
     * @param streetName The name of the street.
     */
    void setStreetName(String streetName);
    
    /**
     * Sets the name of the town or city of this address.
     * 
     * @param townOrCityName The name of the town or city.
     */
    void setTownOrCityName(String townOrCityName);
    
    /**
     * Sets the name of the region of this address.
     * 
     * @param regionName The name of the region.
     */
    void setRegionName(String regionName);
    
    /**
     * Sets the post code of this address.
     * 
     * @param postcode The post code.
     */
    void setPostcode(String postcode);
}
