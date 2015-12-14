package org.transmartproject.core.dataquery.highdim.projections


public interface MultiValueProjection {

    /**
     * Returns a map with the keys/properties and types that are available in the object returned by
     * queries using this projection. The returned map has a stable and meaningful iteration order.
     */
    public Map<String, Class> getDataProperties()


}
