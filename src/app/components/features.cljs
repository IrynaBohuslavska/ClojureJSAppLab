(ns app.components.features (:require
                             [app.components.reused.text :refer [text]]
                             [app.components.reused.button :refer [button]]))

(defn features []
  [:div.container.margTop 
   [:div.row.container
    [:div {:class "col-md-6 order-md-2 padChapter margTop"}
     [text {:hdr "Design & build with the least of code integration"
      :tx "Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula
                            porta felis euismod
                            semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus,
                            tellus ac cursus
                            commodo."}]

     [button {:text "Learn more"
              :color "btn-primary text-white"}]]
   [:div {:class "col-md-6 order-md-1"}
    [:img {:class "img-fluid mx-auto"
           :src "/pictures/main/integration.png"}]]
   ]]
  )