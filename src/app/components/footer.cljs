(ns app.components.footer)

(def menu [{:title "Home"
            :route ::home}
           {:title "Key Features"
            :route ::key-features}
           {:title "Pricing"
            :route ::home}
           {:title "Testimal"
            :route ::key-features}
           {:title "FQA"
            :route ::home}])                 

(defn footer []
  [:div {:class "dark-brue text-white text-center pad padChapter"}
   [:div {:class "container marg"}
    [:div.text-center 
     [:img {:src "/pictures/main/logoWhite.PNG"
            :height "30"}]
     ]    
    (for [menu-item menu]
      [:a {:class "text-dark navbar-items text-white"
           :key (:title menu-item)}
       (:title menu-item)])]
   [:div {:class "marg pad"} "Lorem ipsum dolor sit amet, consectetur adipisicing elit."]
   ]
  )