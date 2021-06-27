(ns app.components.retit-fqa
  (:require [reagent.core :as r]
            [reitit.frontend :as rf]
            [reitit.frontend.easy :as rfe]
            [reitit.coercion.spec :as rss]
            [spec-tools.data-spec :as ds]
            [fipp.edn :as fedn]
            [app.components.reused.text :refer [text]]
            [app.components.reused.button :refer [button]]))


(def first-card [{:title "Drag & Drop Builder"
                  :class-first-card ""}
                 {:title "1.000's of Templates"
                  :class-first-card "padChapter"}
                 {:title "Blog support Tools"
                  :class-first-card "padChapter"}
                 {:title "eCommerce Store"
                  :class-first-card "padChapter"}
                 ])


(defn clock []
  [:div
   [:h2 "Welcome to frontend hear will be clock"]])

(defn buy []
  [:div.container.margTop
   [:div.row.text-center
    [:div.col-md
     [text
      {:hdr "Take extra features without extra charges"
       :tx "Quickly build an effective pricing table for your potential customers with
                            this Bootstrap example. It's built with default Bootstrap components and utilities with little
                            customization."}]]]
   [:div.container
    [:div {:class "row text-center margBuyChapt"}
     [:div.col-md
      [:div {:class "btn-group btn-group-toggle" :data-toggle= "buttons"}
       [:lable {:class "btn btn-primary active"} "Monthly"]
       [:lable {:class "btn border"} "Annually"]]]]]

   [:div.container.margTop
    [:div {:class "row text-center d-flex justify-content-center"}
     [:div {:class "col-md-4"}
      [:div {:class "card mb-2 rounded-3 shadow"}
       [:div {:class "card-header py-3 gradient-head"}
        [:h1 {:class "my-0 fw-normal" :id "changeTextM"} "$0/month"]
        [:h4 [:b "Buisiness Class"]]
        [:h5 "For small teans or office"]]
       [:div {:class "card-body"}
        [:ul {:class "list-unstyled mt-3 mb-4"}
         (for [item first-card]
           [:li {:class (:class-first-card item)
                 :key (:title item)}
            (:title item)])]
        [button {:text "Start free tril"
                 :color "btn-primary text-white"}]]]]
     
     [:div {:class "col-md-4"}
     [:div {:class "card mb-2 rounded-3 shadow"}
      [:div {:class "card-header py-3 gradient-head"}
       [:h1 {:class "my-0 fw-normal" :id "changeTextM"} "$99/month"]
       [:h4 [:b "Pro Master"]]
       [:h5 "For best opportunities"]]
      [:div {:class "card-body"}
       [:ul {:class "list-unstyled mt-3 mb-4"}
        (for [item first-card]
          [:li {:class (:class-first-card item)
                :key (:title item)}
           (:title item)])]
       [button {:text "Start free tril"
                :color "btn-primary text-white"}]
       [button {:text "Or Start 14 days trail"
                :color "text-primary"}]]]]
     ]
    ]
   ]   
   )


(defn tom []
  
  [:div.container.margTop
   [:sapn {:class "fa fa-star checked"}]
   [:sapn {:class "fa fa-star checked"}]
   [:sapn {:class "fa fa-star checked"}]
   [:sapn {:class "fa fa-star checked"}]
   [:h6 "User friendly & Customisable"]
   [:p "Donec ullamcorper nulla non metus auctor fringilla.
                            Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem
                            nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus."]
   [:div.row.text-center
    [:div {:class "col-md-5 order-md-2"}
     [:h6 "Tom Tomson"]]
    [:div {:class "col-md-5 order-md-1"}
     [:img {:class "img-fluid mx-auto"
            :src "/pictures/clients/client-1.png"}]]]]
  )


(defn joe []

  [:div.container.margTop
   [:sapn {:class "fa fa-star checked"}]
   [:sapn {:class "fa fa-star checked"}]
   [:sapn {:class "fa fa-star checked"}]
   [:sapn {:class "fa fa-star checked"}]
   [:h6 "User friendly & Customisable"]
   [:p "Donec ullamcorper nulla non metus auctor fringilla.
                            Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem
                            nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus."]
   [:div.row.text-center
    [:div {:class "col-md-5 order-md-2"}
     [:h6 "Joe Jonson"]]
    [:div {:class "col-md-5 order-md-1"}
     [:img {:class "img-fluid mx-auto"
            :src "/pictures/clients/user-3.png"}]]]])

(defonce match (r/atom nil))

(defn current-page []
  [:div.container.margTop
   [:ul.list-group.list-group-horizontal.d-flex.justify-content-center
    [:li.list-group-item [:a {:href (rfe/href ::buy)} "Buy"]]
    [:li.list-group-item [:a {:href (rfe/href ::frontpage)} "Clock"]]
    [:li.list-group-item [:a {:href (rfe/href ::tom)} "Tom Tomson"]]
    [:li.list-group-item [:a {:href (rfe/href ::joe)} "Joe Jonson"]]]
   (if @match
     (let [view (:view (:data @match))]
       [view @match]))])

(def routes
  [["/clock"
    {:name ::frontpage
     :view clock}]
   
   ["/tom"
    {:name ::tom
     :view tom}]
   
   ["/joe"
    {:name ::joe
     :view joe}]

   ["/"
    {:name ::buy
     :view buy}]
])

(defn init! []
  (rfe/start!
   (rf/router routes {:data {:coercion rss/coercion}})
   (fn [m] (reset! match m))
   {:use-fragment true})
  (r/render [current-page] (.getElementById js/document "app")))

(init!)