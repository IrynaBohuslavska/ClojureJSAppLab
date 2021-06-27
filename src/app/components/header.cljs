(ns app.components.header  (:require
                            [app.components.reused.button :refer [button]]))

(def menu [{:title "Home"
            :route ::home}
           {:title "Key Features"
            :route ::key-features}
           {:title "Pricing"
            :route ::home}
           {:title "Testimal"
            :route ::testimal}
           {:title "FQA"
            :route ::fqa}])

(defn header []
  [:div 
   {:class "fixed-top d-flex flex-column flex-md-row flex-sm-row align-items-center p-3 bg-white box-shadow"}
   [:h5 {:class "mr-md-auto font-weight-normal margin"}
    [:img {:src "/pictures/main/logo.png"}]]
   [:nav {:class "row"}
    (for [menu-item menu]
       [:a {:class "text-dark navbar-items"
            :key (:title menu-item)
            :href (:route menu-item)}
        (:title menu-item)])
    [button {:text "Try now"
             :color "btn-primary text-white"}]
    ]])
