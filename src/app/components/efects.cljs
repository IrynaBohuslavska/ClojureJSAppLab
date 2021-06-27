(ns app.components.efects
  (:require
   [app.components.reused.text :refer [text]]))

(defn efects []
  [:div.container.margTop
   [:div.row.margTop
    [:div.text-center.col-md-4
     [:img {:src "/pictures/icons/icon-4.png"}]
     [text {:hdr "Automatic Payouts"
            :tx "Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh
                            ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent
                            commodo cursus magna."}]]
    [:div.text-center.col-md-4
     [:img {:src "/pictures/icons/icon-5.png"}]
     [text {:hdr "Network Efect"
            :tx "Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh
                            ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent
                            commodo cursus magna."}]]
    [:div.text-center.col-md-4
     [:img {:src "/pictures/icons/icon-6.png"}]
     [text {:hdr "Bigger Rewards Method"
            :tx "Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh
                            ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent
                            commodo cursus magna."}]]]
   ])