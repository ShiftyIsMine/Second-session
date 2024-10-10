import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import './chap060919/styles.css'
// import './chap04/Button.css';
// import './chap05/Clock.css';
import App from './App';
import ConfirmDialog from './chap04/ConfirmDialog';
import reportWebVitals from "./reportWebVitals";
import Notification from "./chap060919/Notification";
import Comment from './chap060912/Comment';
import CommentList from "./chap060912/CommentList";
import NotificationList from "./chap060919/NotificationList";
// import Accommodate from "./chap060926/Accommodate";
// import Toggle from "./chap081010/Toggle"
// import Toggle2 from "./chap081010/Toggle2"
import ClickButton from "./chap081010/ClickButton";
import Counter from "./chap081010/Counter";
import InputTest from "./chap081010/InputTest";
import ConfirmButton from "./chap081010/ConfirmButton";
import ConfirmButton2 from "./chap081010/ConfirmButton2";
import ConfirmButton3 from "./chap081010/ConfirmButton3";

const root = ReactDOM.createRoot(document.getElementById('root'));

    root.render(
        <React.StrictMode>
            <ConfirmButton3 />
        </React.StrictMode>
    );
// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
