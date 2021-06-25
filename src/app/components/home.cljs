(ns app.components.home(:require
             [app.components.reused.text :refer [text]]
             [app.components.reused.button :refer [button]]))

(defn home []
  [:div.bg1
   [:div.container
    [:div.row
     [:div
      [:div {:class "col-md-7 margHead"}
       [:div {:class "margImg"}
        [:img {:src "/pictures/main/1.PNG"
               :height "30"}]]]
      [text {:hdr "Best app for your modern life style"
             :tx "Lorem ipsum dolor sit amet, consectetur adipisicing elit.
            Adipisci, blanditiis cum."}]
      [:div.row
       [:div.col-md-3
        [button {:text "Try for free" :color "btn-primary text-white"}]]
       [:div.col-md-6
        [button {:text "Whatch demo video"
                 :color "text-primary"}]]]]
     [:div {:class "col-md-5 margHead"}
      [:img {:src "/pictures/main/home.png"}]]]]]
  )
